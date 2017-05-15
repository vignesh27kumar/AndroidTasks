package com.example.vigneshsm.review;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Vignesh S.M on 4/25/2017.
 */

public class View_Holder extends RecyclerView.ViewHolder {
    TextView name;
    TextView rollno;
    View_Holder(View itemview) {
        super(itemview);
        name = (TextView) itemview.findViewById(R.id.name);
        rollno = (TextView) itemview.findViewById(R.id.rollno);
    }

}
