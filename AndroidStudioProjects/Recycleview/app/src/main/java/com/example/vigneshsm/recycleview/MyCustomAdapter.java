package com.example.vigneshsm.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vignesh S.M on 4/25/2017.
 */

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {
    Context context;
    ArrayList<Information> data;
    LayoutInflater inflater;

    public MyCustomAdapter(Context context, ArrayList<Information> data) {
        this.context=context;
        this.data=data;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyCustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view=inflater.inflate(R.layout.list_item_row,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myviewHolder, int position) {
 myviewHolder.textview.setText(data.get(position).Title);
        myviewHolder.imageview.setImageResource(data.get(position).imageid);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textview;
        ImageView imageview;
        public MyViewHolder(View itemView) {
            super(itemView);
            textview= (TextView) itemView.findViewById(R.id.txt);
            imageview= (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
