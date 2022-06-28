package com.example.desenho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Oval extends View {
    private final float left;
    private final float top;
    private final float right;
    private final float bottom;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);



    public Oval( Context context, float left, float top, float right, float bottom) {
        super(context);
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
            // define a cor base
            // cor original: 0xFFFFFAA0 - cor azul ciano
            mPaint.setColor (0xFFB69327); // cor vermelha
        }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);// usa super porque é classe
        // desenha um círculo
        canvas.drawOval(left,top, right, bottom, mPaint);
    }

}
