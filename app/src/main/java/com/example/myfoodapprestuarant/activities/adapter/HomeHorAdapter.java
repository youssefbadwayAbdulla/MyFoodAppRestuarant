package com.example.myfoodapprestuarant.activities.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.databinding.HomeHorizantalItemBinding;
import com.example.myfoodapprestuarant.model.HomeHorModel;
import com.example.myfoodapprestuarant.model.HomeVerModel;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.HomeHorHolder> {

    updataVerticalRec updataVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    Activity activity;
    boolean check = true;
    boolean select = true;
    int rowIndex = -1;

    public HomeHorAdapter(com.example.myfoodapprestuarant.activities.adapter.updataVerticalRec updataVerticalRec, ArrayList<HomeHorModel> homeHorModelList, Activity activity) {
        this.updataVerticalRec = updataVerticalRec;
        this.homeHorModelList = homeHorModelList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public HomeHorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeHorHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.home_horizantal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHorHolder holder, @SuppressLint("RecyclerView") int position) {
        HomeHorModel homeHorModel = homeHorModelList.get(position);
        holder.binding.ivHorPizza.setImageResource(homeHorModel.getImage());
        holder.binding.tvHorPizzaName.setText(homeHorModel.getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();
            homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza1, "pizza 1", "10:00 - 23:00", "4.5", "Min - 45EGP"));
            homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza2, "pizza 2", "10:00 - 23:00", "4.5", "Min - 75EGP"));
            homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza3, "pizza 3", "10:00 - 23:00", "4.5", "Min - 85EGP"));
            homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza4, "pizza 4", "10:00 - 23:00", "4.5", "Min - 105EGP"));
            updataVerticalRec.CallBack(position, homeVerModelArrayList);
            check = false;
        }
        holder.binding.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rowIndex = position;
                notifyDataSetChanged();
                if (position == 0) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();

                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza1, "pizza 1", "10:00 - 23:00", "4.5", "Min - 45EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza2, "pizza 2", "10:00 - 23:00", "4.5", "Min - 75EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza3, "pizza 3", "10:00 - 23:00", "4.5", "Min - 85EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza4, "pizza 4", "10:00 - 23:00", "4.5", "Min - 105EGP"));
                    updataVerticalRec.CallBack(position, homeVerModelArrayList);
                } else if (position == 1) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();

                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.burger1, "Burger 1 ", "10:00 - 23:00", "4.5", "Min - 35EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.burger2, "Burger 2", "10:00 - 23:00", "4.5", "Min - 45EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.burger4, "Burger 3", "10:00 - 23:00", "4.5", "Min - 55EGP"));
                    updataVerticalRec.CallBack(position, homeVerModelArrayList);
                } else if (position == 2) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();

                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.fries1, "Fries 1 ", "10:00 - 23:00", "4.5", "Min - 15EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.fries2, "Fries 2", "10:00 - 23:00", "4.5", "Min - 22EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.fries3, "Fries 3", "10:00 - 23:00", "4.5", "Min - 28EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.fries4, "Fries 4", "10:00 - 23:00", "4.5", "Min - 35EGP"));
                    updataVerticalRec.CallBack(position, homeVerModelArrayList);
                } else if (position == 3) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();

                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.icecream1, "IceCream 1 ", "10:00 - 23:00", "4.5", "Min - 20EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.icecream2, "IceCream 2", "10:00 - 23:00", "4.5", "Min - 30EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.icecream3, "IceCream 3", "10:00 - 23:00", "4.5", "Min - 45EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.icecream4, "IceCream 4", "10:00 - 23:00", "4.5", "Min - 55EGP"));
                    updataVerticalRec.CallBack(position, homeVerModelArrayList);
                } else if (position == 4) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();

                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.sandwich1, "Sandwich 1 ", "10:00 - 23:00", "4.5", "Min - 25EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.sandwich2, "Sandwich 2", "10:00 - 23:00", "4.5", "Min - 30EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.sandwich3, "Sandwich 3", "10:00 - 23:00", "4.5", "Min - 45EGP"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.sandwich4, "Sandwich 4", "10:00 - 23:00", "4.5", "Min - 55EGP"));
                    updataVerticalRec.CallBack(position, homeVerModelArrayList);
                }

            }
        });

        if (select) {
            if (position == 0) {
                holder.binding.cardView.setBackgroundResource(R.drawable.change_bg);
                select = false;
            }
        } else {
                if (rowIndex == position) {
                    holder.binding.cardView.setBackgroundResource(R.drawable.change_bg);
                }
                else {
                    holder.binding.cardView.setBackgroundResource(R.drawable.defoult_bg);
                }
            }



    }

    @Override
    public int getItemCount() {
        return homeHorModelList.size();
    }

    class HomeHorHolder extends RecyclerView.ViewHolder {
        HomeHorizantalItemBinding binding;

        public HomeHorHolder(@NonNull HomeHorizantalItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
