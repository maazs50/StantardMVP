package com.example.stantardmvp;

import android.content.Context;

import androidx.multidex.MultiDexApplication;

import com.example.stantardmvp.network.BaseRetrofitHandler;

public class StdApplication extends MultiDexApplication {
    private static final String TAG = StdApplication.class.getSimpleName();
    private static Context sAppContext;
    private static StdApplication mInstance;
    public static synchronized StdApplication getInstance() {
        return mInstance;
    }
    public static Context getsAppContext() {
        return sAppContext.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        sAppContext = this;

        BaseRetrofitHandler.getInstance().setupRetrofitAndOkHttp();
    }
/*    public void setConnectivityListener(NetworkChangeReceiver.ConnectivityReceiverListener listener) {
        NetworkChangeReceiver.connectivityReceiverListener = listener;
    }*/
}
