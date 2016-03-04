package com.example.administrator.servicelearning;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2016/3/5.
 */
public class AIDLSerVice extends Service {
    private CatBinder catBinder;
    class CatBinder extends IMyAidlInterface.Stub{
        @Override
        public String getColor() throws RemoteException {
            Log.e("hhha", "hsfdsdf");
            return "蓉儿";
        }

        @Override
        public double getLong() throws RemoteException {
            return 520;
        }
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("hhha", "hsfdsdf");
        return new CatBinder();
    }
}
