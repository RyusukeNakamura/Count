package com.lifeistech.android.count;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        textView.setText("0");
    }

    public void plus(View v){
        number++;
        red10();
        textView.setText(String.valueOf(number));
    }
    public void minus(View v){
        number--;
        red10();
        textView.setText(String.valueOf(number));
    }
    public void red10(){
        if(number>=10){
            textView.setTextColor(Color.RED);
        }else{
            textView.setTextColor(Color.BLACK);
        }
    }
}
