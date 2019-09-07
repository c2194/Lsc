package com.c2194.Lsc;

import android.app.KeyguardManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;







public class LscService extends Service {
    public LscService() {
    }

    private KeyguardManager km;
    private KeyguardManager.KeyguardLock kk;
    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent arg1) {


            Log.e("-----能够跳到锁屏界面--------", "---------" + arg1);
            Intent intent = new Intent(context, LscActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    };

    @Override
    public IBinder onBind(Intent arg0) {

        return null;
    }


    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);

        //服务里面收到关闭屏幕的动作就发送广播
        IntentFilter iFilter = new IntentFilter(Intent.ACTION_SCREEN_OFF);

        this.registerReceiver(broadcastReceiver, iFilter);
        IntentFilter iFilter2 = new IntentFilter(Intent.ACTION_SCREEN_ON);

        this.registerReceiver(broadcastReceiver, iFilter2);

    }

    @Override
    public void onCreate() {
        super.onCreate();
        //屏蔽掉系统的锁屏
        km = (KeyguardManager) getSystemService(Context.KEYGUARD_SERVICE);
        kk = km.newKeyguardLock("");
        kk.disableKeyguard();

    }

    @Override
    public void onDestroy() {

        super.onDestroy();
    }


}




