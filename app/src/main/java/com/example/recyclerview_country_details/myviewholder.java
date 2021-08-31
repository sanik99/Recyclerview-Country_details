package com.example.recyclerview_country_details;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {

    TextView coname, code;
    ImageView img;

    public myviewholder(@NonNull View itemView) {
        super(itemView);

        coname = itemView.findViewById(R.id.coname);
        code = itemView.findViewById(R.id.code);
        img = itemView.findViewById(R.id.img);

    }

}
