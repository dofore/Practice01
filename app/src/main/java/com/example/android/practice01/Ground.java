package com.example.android.practice01;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class Ground {
    private final Paint paint = new Paint();

    final Rect rect;

    public Ground(int left, int top, int right, int bottom) {
        this.rect = new Rect(left, top, right, bottom);

        paint.setColor(Color.rgb(153,76,0));
    }

    public void draw(Canvas canvas) {
        canvas.drawRect(rect, paint);
    }

    public void move(int moveToLeft) {
        rect.offset(-moveToLeft,0);
    }
    // 地面の形状を確認
    public boolean isShown(int width, int height) {
        return rect.intersects(0,0, width, height);
    }

    public boolean isAvailable() {
        return rect.right > 0;
    }

}
