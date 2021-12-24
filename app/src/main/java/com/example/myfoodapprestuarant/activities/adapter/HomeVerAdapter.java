package com.example.myfoodapprestuarant.activities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.databinding.HomeVarticalIteamBinding;
import com.example.myfoodapprestuarant.model.HomeVerModel;

import java.util.ArrayList;

public class HomeVerAdapter extends RecyclerView.Adapter<HomeVerAdapter.HomeVerHolder> {
    ArrayList<HomeVerModel> homeVerModelList;
    Context context;

    public HomeVerAdapter(ArrayList<HomeVerModel> homeVerModelList, Context context) {
        this.homeVerModelList = homeVerModelList;
        this.context = context;
    }


    @NonNull
    @Override
    public HomeVerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeVerHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.home_vartical_iteam, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeVerHolder holder, int position) {
        HomeVerModel homeVerModel = homeVerModelList.get(position);
        holder.binding.ivVerDinner.setImageResource(homeVerModel.getImage());
        holder.binding.tvVerProductName.setText(homeVerModel.getName());
        holder.binding.tvVerHourTime.setText(homeVerModel.getTiming());
        holder.binding.tvVerRatting.setText(homeVerModel.getRating());
        holder.binding.verPrice.setText(homeVerModel.getPrice());
    }

    @Override
    public int getItemCount() {
        return homeVerModelList.size();
    }

    class HomeVerHolder extends RecyclerView.ViewHolder {
        HomeVarticalIteamBinding binding;

        public HomeVerHolder(@NonNull HomeVarticalIteamBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
