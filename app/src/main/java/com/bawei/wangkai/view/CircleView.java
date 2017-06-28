package com.bawei.wangkai.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by DELL on 2017/6/12.
 * 自定义一个View 继承View类
 */

public class CircleView extends View {
    //画笔
    Paint paint;
    //x y点
    private float x = 100;
    private float y = 100;
    Rect rect = new Rect();

    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //实例化画笔
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    //重写构造方法

    //绘制
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(x,y,100,paint);
        rect.set((int)(x-100),(int) (y-100),(int)( x+100),(int)(y+100));

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            //按下
            case MotionEvent.ACTION_DOWN:

                break;
            //移动
            case MotionEvent.ACTION_MOVE:
                float x1 = event.getX();
                float y1 = event.getY();

                if (x1 > rect.left && x1 < rect.right && y1 > rect.top && y1 <rect.bottom){
                    x = event.getX();
                    y = event.getY();
                    //调用主线程刷新
                    invalidate();
                }

                break;
            //松开手指
            case MotionEvent.ACTION_UP:

                break;
        }

        return true;
    }
}
