package com.lxy.ndk;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class J2CActivity extends AppCompatActivity {

    private TextView mTV2;
    private TextView mTV3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(new Fade());
        }
        setContentView(R.layout.activity_second);

        mTV2 = (TextView) findViewById(R.id.tv2);
        //mTV2.setText(getTV2());
       // mTV2.setText(add(5,2)+"");//传递int给c


    }
    public void goC2J(View view){
        Intent intent = new Intent(this,C2JActivity.class);
        startActivity(intent);
    }

    public native String getTV2();

    /**
     * 把两个int数值传递给c语言
     * @param a
     * @param b
     * @return
     */
    public native int add(int a,int b);

    /**
     * 把一个字符串传递给c语言,c语言在后面添加“hello”后返回给java
     */
    public native String get(String str);

    /**
     * 把一个int数组传递给c语言，c语言把每个元素加1后返回给java
     */
    public native int[] getInt(int[] arr);
}
