package com.example.recyclerview_country_details;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder> {

    ArrayList<contents> data;
    ArrayList<contents2> data2;
    Context context;

    public myadapter(ArrayList<contents> data, ArrayList<contents2> data2,Context context)
    {
        this.data = data;
        this.data2 = data2;

        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.country_row,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        final contents2 temp = data2.get(position);


        holder.coname.setText(data.get(position).getCountry());
        holder.code.setText(data.get(position).getCode());
        holder.img.setImageResource(data.get(position).getImgname());

        //making coname(country name) clickabke
        holder.coname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,country_details.class);
                intent.putExtra("countryname", temp.getCountryID());
                intent.putExtra("area", temp.getAreaID());
                intent.putExtra("religion", temp.getReligionID());
                intent.putExtra("population", temp.getPopulationID());
                intent.putExtra("detailsarea", temp.getDetailsArea());
                intent.putExtra("flag", temp.getFlagID());
                intent.putExtra("animals", temp.getAnimalsID());
                intent.putExtra("birds", temp.getBirdsID());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }


}
