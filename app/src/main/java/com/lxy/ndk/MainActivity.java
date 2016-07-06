package com.lxy.ndk;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("jniLib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public native String getString();

    public native String getData();

    public native int getNum(int a, int b);
    public native String get();

    public void goSecond(View view){
        Intent intent = new Intent(this,J2CActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        }else {
            startActivity(intent);
        }
    }

}
