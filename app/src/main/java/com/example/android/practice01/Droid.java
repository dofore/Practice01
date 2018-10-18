package com.example.android.practice01;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Droid {

    private static final float GRAVITY = 0.8f;
    private static final float WEIGHT = GRAVITY * 60;

    private final Paint paint = new Paint();
    private Bitmap bitmap;

    final Rect rect;

    public interface Callback{
        public int getDistanceFromGround(Droid droid);
    }

    private final Callback callback;

    private float acceleration = 0;

    public Droid(Bitmap bitmap, int left, int top ,Callback callback) {
        this.rect = new Rect(left, top, left + bitmap.getWidth(), top + bitmap.getHeight());
        this.bitmap = bitmap;
        this.callback = callback;
    }

    public void draw(Canvas canvas) {
        bitmap = Bitmap.createScaledBitmap(bitmap, 150, 150, false);
        canvas.drawBitmap(bitmap, rect.left, rect.top, paint);
    }

    public void jump(float time) {
        acceleration = time * WEIGHT;
    }

    public void move() {

        acceleration -= GRAVITY;

        int distanceFromGround = callback.getDistanceFromGround(this);
        if(distanceFromGround < 0 && acceleration < -distanceFromGround) {
            acceleration = -distanceFromGround;
        }

        rect.offset(0,-Math.round(acceleration));
    }

    // シャットダウン
    public void shutdown() {
        acceleration = 0;
    }
}
