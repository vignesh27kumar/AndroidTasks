package com.example.vigneshsm.price;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by Vignesh S.M on 5/4/2017.
 */

public class Dialog extends DialogFragment implements View.OnClickListener {

    Button save;
    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View vi = inflater.inflate(R.layout.frag, null);


        save = (Button) vi.findViewById(R.id.save_btn);
        save.setOnClickListener(this);

        builder.setView(vi);
        builder.setCancelable(true);
        builder.setTitle("Price");
        builder.show();
        return builder.show();


    }

    @Override
    public void onClick(View v) {
     dismiss();
    }
}



