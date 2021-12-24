package com.example.myfoodapprestuarant.activities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.databinding.DetailedDailyMealItemBinding;
import com.example.myfoodapprestuarant.model.DetailedDailyModel;

import java.util.List;

public class DetailedDailyAdapter extends RecyclerView.Adapter<DetailedDailyAdapter.DetailedDailyHolder> {
    List<DetailedDailyModel> detailedDailyModelList;
    Context context;

    public DetailedDailyAdapter(List<DetailedDailyModel> detailedDailyModelList, Context context) {
        this.detailedDailyModelList = detailedDailyModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public DetailedDailyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DetailedDailyHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.detailed_daily_meal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailedDailyHolder holder, int position) {
        DetailedDailyModel detailedDailyModel = detailedDailyModelList.get(position);
        holder.binding.ivDetailedItem.setImageResource(detailedDailyModel.getImage());
        holder.binding.detailedName.setText(detailedDailyModel.getName());
        holder.binding.detailedDescription.setText(detailedDailyModel.getDescription());
        holder.binding.detailedRatting.setText(detailedDailyModel.getRating());
        holder.binding.tvDetailedPrice.setText(detailedDailyModel.getPrice());
        holder.binding.tvDetailedTime.setText(detailedDailyModel.getTiming());


    }

    @Override
    public int getItemCount() {
        return detailedDailyModelList.size();
    }

    public class DetailedDailyHolder extends RecyclerView.ViewHolder {
        DetailedDailyMealItemBinding binding;

        public DetailedDailyHolder(@NonNull DetailedDailyMealItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
