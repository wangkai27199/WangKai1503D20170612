package com.bawei.wangkai;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;

import com.bawei.wangkai.view.CircleView;
import com.bawei.wangkai.view.MyView;

/**
 * 操作主界面的类
 */
public class MainActivity extends Activity {

    private MyView myview;
    private float num = 0.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //拿到布局中的控件
        myview = (MyView) findViewById(R.id.myview);
        //点击事件


    }
}
