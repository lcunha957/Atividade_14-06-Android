package com.example.desenho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Reta  extends View {
    private final float startx;
    private final float starty;
    private final float stopx;
    private final float stopy;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Reta(Context context, float x1, float y1, float x2, float y2) {
        super(context);
        this.startx = x1;
        this.starty = y1;
        this.stopx = x2;
        this.stopy = y2;
        mPaint.setColor(0xFF4D439E); // é para ser entre o roxo e o azul
        mPaint.setStrokeWidth(25f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);// usa super porque é classe
        // desenha um círculo
        canvas.drawLine(startx,starty,stopx,stopy, mPaint);

    }

}
