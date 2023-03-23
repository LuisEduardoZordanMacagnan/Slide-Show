package com.ifsc.slideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagem;
    int[] imagens = {
            R.drawable.ohheybabe,
            R.drawable.unknown,
            R.drawable.troll,
            R.drawable.gomba
    };
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagem = (ImageView) findViewById(R.id.imageView);
    }

    public void Next(View view){
        i++;
        if(i>3){
            i=0;
        }
        imagem.setImageResource(imagens[i]);
    }

    public void Until(View view){
        i--;
        if(i<0){
            i=imagens.length-1;
        }
        imagem.setImageResource(imagens[i]);
    }

    public void Home(View view){
        i=0;
        imagem.setImageResource(imagens[i]);
    }
}