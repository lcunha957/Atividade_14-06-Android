package com.example.desenho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

   private FrameLayout main;
   private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        // obter o id da view
        main = (FrameLayout) findViewById(R.id.main_view);
        // adicionando a view da bola no tamanho x = 100, y = 100 e r =40;
        main.addView(new Bola(this, 100, 100, 40));
        main.addView(new Quadrado(this, 50, 25, 10, 20));
        main.addView(new Reta(this,5,5,6,10));
        main.addView(new Oval(this,80,180,120, 150));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = main.getChildCount(); i >= 0; i--) {
                    View vi = main.getChildAt(i);
                    View vf = main.getChildAt(i);
                    View vr = main.getChildAt(i);
                    View vu = main.getChildAt(i);
                    if (vi instanceof Bola) {
                        main.removeViewAt(i);
                    }
                    if (vf instanceof Quadrado){
                        main.removeViewAt(i);
                    }
                    if (vr instanceof Reta){
                        main.removeViewAt(i);
                    }
                    if (vu instanceof Oval){
                        main.removeViewAt(i);
                    }
                }
            }

        });

            }



    @Override
    public boolean onTouchEvent (MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                main.addView(new Bola(this,event.getX(),event.getY(), 40));
                /*main.addView(new Quadrado(this,
                        event.getX(),100, event.getX(),
                         100));*/
                main.addView(new Quadrado(this,event.getX(),event.getX()+100 , event.getY(), event.getY()+100));

                main.addView(new Reta(this, event.getX()+200, event.getY()+200,event.getX()+400, event.getY()+200 ));

                main.addView (new Oval(this,event.getX()+300, event.getY()+200,event.getX()+600, event.getY()+300));

                return true;

            case MotionEvent.ACTION_MOVE:
                return true;
        }

        return true;
    }
}