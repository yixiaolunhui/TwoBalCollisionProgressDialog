package com.dalong.demo.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

import java.util.ArrayList;

import kr.pe.burt.android.lib.androidchannel.Timer;

/**
 * Created by zhouweilong on 15/10/29.
 */
public class CustomImageView  extends ImageView{


    private final static int DEFAULT_INTERVAL = 2000; //时间

    private Timer timer;//时间计时器

    private int interval = DEFAULT_INTERVAL;//循环切换时间

    private ArrayList<Drawable> drawableList;//所有图片的集合

    private int currentFrameIndex = 0;//当前的图片index

    private boolean loop = false;

    private int animationRepeatCount = 1;

    private boolean restoreFirstFrameWhenFinishAnimation = true;


    /**
     * 构造方法
     * @param context
     */
    public CustomImageView(Context context) {
        this(context, null);
    }

    /**
     * 构造方法
     * @param context
     * @param attrs
     */
    public CustomImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * 构造方法
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    public CustomImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 切换的时间
     * @param interval
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }


    /**
     * 添加图片数据
     * @param resId
     */
    @SuppressWarnings("deprecation")
    public void addImageFrame(int resId) {
        if(drawableList == null) {
            drawableList = new ArrayList<>();
        }
        drawableList.add(getContext().getResources().getDrawable(resId));

    }


    /**
     * 开始动画切换图片
     */
    public void startAnimation() {

        if(drawableList == null || drawableList.size() == 0) {
            throw new IllegalStateException("You shoud add frame at least one frame");
        }


        currentFrameIndex = 0;
        setImageDrawable(drawableList.get(currentFrameIndex));

        if(timer == null) {
            timer = new Timer(interval, new Timer.OnTimer() {
                @Override
                public void onTime(Timer timer) {
                    currentFrameIndex++;
                    if(currentFrameIndex == drawableList.size()) {
                        if(loop) {
                            currentFrameIndex = 0;
                        } else {
                            animationRepeatCount--;

                            if(animationRepeatCount == 0) {
                                if (restoreFirstFrameWhenFinishAnimation) {
                                    currentFrameIndex = 0;
                                } else {
                                    currentFrameIndex = drawableList.size() - 1;
                                }
                                stopAnimaion();
                            } else {
                                currentFrameIndex = 0;
                            }
                        }
                    }
                    setImageDrawable(drawableList.get(currentFrameIndex));
                }
            });
            timer.stop();
        }
        if(timer.isAlive() == false) {
            timer.start();
        }
    }

    /**
     * 停止动画切换
     */
    public void stopAnimaion() {
        if(timer != null && timer.isAlive()) {
            timer.stop();
        }
        timer = null;
    }

    /**
     * 是否循环
     * @param loop
     */
    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    /**
     * 设置是否完成动画时还原第一帧
     * @param restore
     */
    public void setRestoreFirstFrameWhenFinishAnimation(boolean restore) {
        this.restoreFirstFrameWhenFinishAnimation = restore;
    }

    /**
     * 设置动画重复计数
     * @param animationRepeatCount
     */
    public void setAnimationRepeatCount(int animationRepeatCount) {
        this.animationRepeatCount = animationRepeatCount;
    }

    /**
     * 复位
     */
    public void reset() {
        stopAnimaion();
        drawableList.clear();
        drawableList = null;
    }
}
