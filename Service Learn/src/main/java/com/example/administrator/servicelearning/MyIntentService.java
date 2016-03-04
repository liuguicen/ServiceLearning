package com.example.administrator.servicelearning;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/3/5.
 */
public class MyIntentService extends IntentService{

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyIntentService() {
        super("name");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Long endTime=System.currentTimeMillis()+20*1000;
        Log.e("start","start");
        while(System.currentTimeMillis()<endTime){
            synchronized (this){
                try{
                    wait(endTime-System.currentTimeMillis());
                }catch (Exception e){

                }
            }
        }
        Log.e("end","end");
    }
}
