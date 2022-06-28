// Aula dia 14-06-2022 , 1a parte: Primitivas de desenho de Android
package com.example.desenho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Bola extends View{

    private final float x;
    private final float y;
    private final int r; // raio do círculo
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Bola(Context context, float x, float y, int r){
        super (context);
        this.x = x;
        this.y = y;
        this.r = r;
        // define a cor base
        // cor original: 0xFFFFFAA0 - cor azul ciano
         mPaint.setColor (0xFF47692C); // cor vermelha
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);// usa super porque é classe
        // desenha um círculo
        canvas.drawCircle(x,y,r,mPaint);
    }

}
