package com.example.vigneshsm.price;

import android.app.*;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Vignesh S.M on 5/5/2017.
 */

public class Discount extends DialogFragment implements View.OnClickListener {
    Button button;
    EditText edxt;

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.discount, null);
        button = (Button) v.findViewById(R.id.savebt);
        button.setOnClickListener(this);
        edxt= (EditText) v.findViewById(R.id.edtx);

        builder.setView(v);
        builder.setTitle("Discount");
        builder.setCancelable(true);
        builder.show();
        return super.onCreateDialog(savedInstanceState);

    }

    @Override
    public void onClick(View v) {
       if(edxt.getText().toString().isEmpty())
       {
           Toast.makeText(getActivity(),"Enter the Data",Toast.LENGTH_SHORT).show();
       }
       else
       {
           Toast.makeText(getActivity(),"percentage-"+edxt.getText().toString()+"\n", Toast.LENGTH_SHORT).show();
       }
        dismiss();

    }
}