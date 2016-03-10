package com.example.iguest.avatar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private int selected;
    private ImageButton[] avatorList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selected = 0;
        ImageButton avator1 = (ImageButton) findViewById(R.id.avator1);
        ImageButton avator2 = (ImageButton) findViewById(R.id.avator2);
        ImageButton avator3 = (ImageButton) findViewById(R.id.avator3);
        ImageButton avator4 = (ImageButton) findViewById(R.id.avator4);
        ImageButton avator5 = (ImageButton) findViewById(R.id.avator5);
        ImageButton avator6 = (ImageButton) findViewById(R.id.avator6);
        ImageButton avator7 = (ImageButton) findViewById(R.id.avator7);
        ImageButton avator8 = (ImageButton) findViewById(R.id.avator8);
        avatorList = new ImageButton[]{null, avator1, avator2, avator3, avator4, avator5, avator6, avator7, avator8};

        avator1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   selected = 1;
                   highlightButton();
               }
           }
        );

        avator2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   selected = 2;
                   highlightButton();
               }
           }
        );

        avator3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   selected = 3;
                   highlightButton();
               }
           }
        );

        avator4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   selected = 4;
                   highlightButton();
               }
           }
        );
        avator5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   selected = 5;
                   highlightButton();
               }
           }
        );
        avator6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   selected = 6;
                   highlightButton();
               }
           }
        );
        avator7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   selected = 7;
                   highlightButton();
               }
           }
        );
        avator8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   selected = 8;
                   highlightButton();
               }
           }
        );
    }

    public void highlightButton() {
        resetFilter();
        if (selected == 1) {
            avatorList[1].setColorFilter(Color.argb(155, 185, 185, 185));
        } else if (selected == 2) {
            avatorList[2].setColorFilter(Color.argb(155, 185, 185, 185));
        } else if (selected == 3) {
            avatorList[3].setColorFilter(Color.argb(155, 185, 185, 185));
        } else if (selected == 4) {
            avatorList[4].setColorFilter(Color.argb(155, 185, 185, 185));
        } else if (selected == 5) {
            avatorList[5].setColorFilter(Color.argb(155, 185, 185, 185));
        } else if (selected == 6) {
            avatorList[6].setColorFilter(Color.argb(155, 185, 185, 185));
        } else if (selected == 7) {
            avatorList[7].setColorFilter(Color.argb(155, 185, 185, 185));
        } else if (selected == 8) {
            avatorList[8].setColorFilter(Color.argb(155, 185, 185, 185));
        }
    }

    public void resetFilter() {
        avatorList[1].setColorFilter(Color.argb(0, 185, 185, 185));
        avatorList[2].setColorFilter(Color.argb(0, 185, 185, 185));
        avatorList[3].setColorFilter(Color.argb(0, 185, 185, 185));
        avatorList[4].setColorFilter(Color.argb(0, 185, 185, 185));
        avatorList[5].setColorFilter(Color.argb(0, 185, 185, 185));
        avatorList[6].setColorFilter(Color.argb(0, 185, 185, 185));
        avatorList[7].setColorFilter(Color.argb(0, 185, 185, 185));
        avatorList[8].setColorFilter(Color.argb(0, 185, 185, 185));
    }


}