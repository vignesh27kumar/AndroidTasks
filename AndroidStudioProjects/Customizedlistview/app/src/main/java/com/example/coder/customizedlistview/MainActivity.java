package com.example.coder.customizedlistview;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
String [] name={"sachin","Ganguly","dravid","Azharhudin","jadeja","robin singh","moniga","srinath","kumble","harbhajan","prasad"};
    String[] age={"16","17","17","27","22","27","25","26","27","14","22"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  ListView listview= (ListView) findViewById(R.id.listview);
        Adapter ad=new Adapter();
        listview.setAdapter(ad);
    }
    class Adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return name.length;
        }

        @Override
        public Object getItem(int arg0) {
            return null;
        }

        @Override
        public long getItemId(int arg0) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater=getLayoutInflater();
            convertView=inflater.inflate(R.layout.single_row,null);
            TextView tx1= (TextView) convertView.findViewById(R.id.txtName);
            TextView txt2= (TextView) convertView.findViewById(R.id.txtAge);
            tx1.setText(name[position]);
            txt2.setText(age[position]);


            return convertView;
        }
    }

}
