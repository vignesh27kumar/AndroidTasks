package com.example.vigneshsm.price;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView price;
    TextView discount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);


    }

    public void show(View v) {
        price = (TextView) findViewById(R.id.price);
        discount= (TextView) findViewById(R.id.discount);
        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               FragmentManager manager=getFragmentManager();
                Dialog di = new Dialog();
                di.show(manager, "dialog");

            }
        });
        discount.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                FragmentManager  manager=getFragmentManager();
            Discount discou=new Discount();
                discou.show(manager,"dialog");
            }
        });

    }
}
