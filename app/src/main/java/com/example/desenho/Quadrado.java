package com.example.desenho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Quadrado extends View {
    private final float right;
    private final float left;
    private final float top;
    private final float bottom;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Quadrado(Context context, float right, float left, float top, float bottom){
        super (context);
        this.right = right;
        this.left = left;
        this.top = top;
        this.bottom = bottom;
        // define a cor base
        // cor original: 0xFFFFFAA0 - cor azul ciano
        mPaint.setColor (0xFFFF00FF); // cor vermelha
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);// usa super porque é classe
        // desenha um círculo
        canvas.drawRect(left,top,right,bottom, mPaint);
    }

}



