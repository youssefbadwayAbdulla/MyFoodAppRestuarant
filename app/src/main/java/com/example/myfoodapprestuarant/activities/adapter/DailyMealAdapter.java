package com.example.myfoodapprestuarant.activities.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.activities.DetailedDailyMealActivity;
import com.example.myfoodapprestuarant.databinding.DailyMealItemBinding;
import com.example.myfoodapprestuarant.model.DailyMealModel;

import java.util.List;

public class DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.DailyMealHolder>{
List<DailyMealModel>dailyMealModelList;
Context context;

    public DailyMealAdapter(List<DailyMealModel> dailyMealModelList, Context context) {
        this.dailyMealModelList = dailyMealModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public DailyMealHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DailyMealHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DailyMealHolder holder, int position) {
        DailyMealModel dailyMealModel=dailyMealModelList.get(position);
        holder.binding.ivDinner.setImageResource(dailyMealModel.getImage());
        holder.binding.tvDinner.setText(dailyMealModel.getName());
        holder.binding.tvDescriptionDinner.setText(dailyMealModel.getDescription());
        holder.binding.tvDiscountDinner.setText(dailyMealModel.getDiscount());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailedDailyMealActivity.class);
                intent.putExtra("type",dailyMealModel.getType());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dailyMealModelList.size();
    }

    public class DailyMealHolder extends RecyclerView.ViewHolder {
        DailyMealItemBinding binding;
        public DailyMealHolder(@NonNull    DailyMealItemBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
