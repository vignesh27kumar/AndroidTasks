package com.example.vigneshsm.listview;

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
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listview);
        list.setAdapter(new adapter(this));
    }
}

class singlerow {
    String title;
    String description;

    singlerow(String title, String description) {
        this.title = title;
        this.description = description;
    }
}

class adapter extends BaseAdapter {
    ArrayList<singlerow> list;
    Context context;

    adapter(Context c) {
        context = c;
        list = new ArrayList<singlerow>();
        Resources res = c.getResources();
        String[] title = res.getStringArray( R.array.title);
        String[] description = res.getStringArray(R.array.description);
        for (int i = 0; i < 4; i++) {
            list.add(new singlerow(title[i], description[i]));
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
      view=getLayoutInflater().
        return row;
    }
}
