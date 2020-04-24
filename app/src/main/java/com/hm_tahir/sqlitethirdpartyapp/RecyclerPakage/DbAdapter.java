package com.hm_tahir.sqlitethirdpartyapp.RecyclerPakage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hm_tahir.sqlitethirdpartyapp.R;

import java.util.ArrayList;

public class DbAdapter extends RecyclerView.Adapter<DbAdapter.DbViewHolder> {

    ArrayList<DbModelClass> objectDBModelClassArrayList;

    public DbAdapter(ArrayList<DbModelClass> objectDBModelClassArrayList) {
        this.objectDBModelClassArrayList = objectDBModelClassArrayList;
    }

    @NonNull
    @Override
    public DbViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View singleRow = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_row,parent,false);

        return new DbViewHolder(singleRow);
    }

    @Override
    public void onBindViewHolder(@NonNull DbViewHolder holder, int position) {
        DbModelClass objectDbModelClass=objectDBModelClassArrayList.get(position);
        holder.imageDesTV.setText(objectDbModelClass.getImageDes());

        holder.ourimageIV.setImageBitmap(objectDbModelClass.getOurImage());
    }

    @Override
    public int getItemCount() {
        return objectDBModelClassArrayList.size();
    }

    public static class DbViewHolder extends RecyclerView.ViewHolder
    {
        TextView imageDesTV;
        ImageView ourimageIV;
        public DbViewHolder(View itemView) {
            super(itemView);

            imageDesTV=itemView.findViewById(R.id.sr_imageDes);
            ourimageIV=itemView.findViewById(R.id.sr_image);
        }
    }
}

