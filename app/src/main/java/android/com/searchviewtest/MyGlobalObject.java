package android.com.searchviewtest;
// Created by SANDAAUNG on 26/09/2017.


import android.app.Application;

public class MyGlobalObject extends Application{

    @Override
    public void onCreate() {
        TypefaceUtils.overrideFont(getApplicationContext(), "normal", "fonts/ZawgyiOne2008.ttf");
    }
}
