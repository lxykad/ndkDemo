package com.lxy.ndk;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * C代码一般早jni目录里,也可以再gradle文件里配置路径,so文件在jniLibs 里
 */
public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("jniLib");//和gradle配置的moudlename 对应
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
    public native void test();

    public void goSecond(View view) {
        Intent intent = new Intent(this, J2CActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        } else {
            startActivity(intent);
        }
    }

}
