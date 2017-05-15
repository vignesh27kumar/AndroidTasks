package com.example.vigneshsm.settings;

import android.app.Dialog;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity  {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        TextView op1= (TextView) findViewById(R.id.discount);
        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();

            }
        });

    }
    private void showDialog(){
        final Dialog mydiag = new Dialog(this);
        mydiag.setTitle("Dialog");
        mydiag.setContentView(R.layout.discount);
        mydiag.show();
    }



}
