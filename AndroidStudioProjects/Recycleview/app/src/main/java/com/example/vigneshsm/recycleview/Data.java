package com.example.vigneshsm.recycleview;

import java.util.ArrayList;

/**
 * Created by Vignesh S.M on 4/25/2017.
 */

public class Data {
    public static ArrayList<Information> getData(){
        ArrayList<Information> data=new ArrayList<>();
        int []images={
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,

                R.drawable.e,
                R.drawable.f,
        };
        String[] Categories={"img1","img2","img3","img4",
        "img5","img6"};
        for(int i=0;i<images.length;i++)
        {
            Information current=new Information();
            current.Title=Categories[i];
            current.imageid=images[i];
            data.add(current);
        }
        return data;
    }
}
