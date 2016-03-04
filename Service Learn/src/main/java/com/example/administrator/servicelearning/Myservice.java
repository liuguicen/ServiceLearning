package com.example.administrator.servicelearning;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/3/5.
 */
public class Myservice extends Service {
    String mname="testBindService";
    public class MyBinder extends Binder {
        void disPlay(){
            Log.e("name=","testBindService");
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("开始", "service");
        return new MyBinder();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Long endTime = System.currentTimeMillis() + 20 * 1000;
        Log.e("start", "start");
        while (System.currentTimeMillis() < endTime) {
            synchronized (this) {
                try {
                    wait(endTime - System.currentTimeMillis());
                } catch (Exception e) {

                }
            }
            Log.e("end", "end");
        }
        return super.onStartCommand(intent, flags, startId);
    }

}
