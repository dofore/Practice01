package com.example.android.practice01;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Screen extends View {

    private static final Paint PAINT = new Paint();
    private Bitmap droidBitmap;

    public Screen(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // super.onDraw(canvas);

        if(droidBitmap == null) {
            Resources res = this.getContext().getResources();
            droidBitmap = BitmapFactory.decodeResource(res, R.drawable.droid);
        }

        canvas.drawBitmap(droidBitmap,0,0,PAINT);
    }
}
