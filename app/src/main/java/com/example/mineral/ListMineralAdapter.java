package com.example.mineral;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListMineralAdapter extends RecyclerView.Adapter<ListMineralAdapter.ListviewHolder> {
    private ArrayList<Mineral> listMineral;

    public ListMineralAdapter(ArrayList<Mineral> list) {
        this.listMineral = list;
    }
    @NonNull
    @Override
    public ListviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_mineral, parent, false);
        return new ListviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListviewHolder holder, int position) {
        Mineral mineral = listMineral.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mineral.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvNama.setText(mineral.getNama());
        holder.tvDetail.setText(mineral.getDetail());

    }

    @Override
    public int getItemCount() {
        return listMineral.size();
    }

    class ListviewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;

        ListviewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_mineral);
            tvNama = itemview.findViewById(R.id.tv_item_nama);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}

