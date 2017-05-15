package com.example.vigneshsm.review;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * Created by Vignesh S.M on 4/24/2017.
 */

public class Recycler_View_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Data> list= Collections.emptyList();
    Context context;
    public  Recycler_View_Adapter(List<Data>list,Context context)
    {
        this.list=list;
        this.context=context;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview,parent,false);
     View_Holder holder=new View_Holder(v);


        return holder;
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {
        holder.name.setText(list.get(position).name);
        holder.rollno.setText(list.get(position).rollno);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
