package com.lxy.ndk;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.view.Window;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mTV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(new Fade());
        }
        setContentView(R.layout.activity_second);

        mTV2 = (TextView) findViewById(R.id.tv2);
        mTV2.setText(getTV2());

    }

    public native String getTV2();

}
