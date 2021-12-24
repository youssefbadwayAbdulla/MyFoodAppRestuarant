package com.example.myfoodapprestuarant.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.activities.adapter.DetailedDailyAdapter;
import com.example.myfoodapprestuarant.databinding.ActivityDetailedDailyMealBinding;
import com.example.myfoodapprestuarant.model.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {
    ActivityDetailedDailyMealBinding binding;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter detailedDailyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");
        detailedDailyModelList = new ArrayList<>();
        detailedDailyAdapter = new DetailedDailyAdapter(detailedDailyModelList, this);
        binding.detailedRv.setAdapter(detailedDailyAdapter);


        if (type != null && type.equalsIgnoreCase("breakfast")) {

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1, "Breakfast", "description", "4.5", "25GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2, "Breakfast", "description", "4.5", "45GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3, "Breakfast", "description", "4.5", "75GEP", "10:00 _9 PM"));
            detailedDailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("Sweets")) {
            binding.ivDetailedActivity.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ss, "Sweet", "description", "4.5", "30GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ss2, "Sweet", "description", "4.5", "35GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3, "Sweet", "description", "4.5", "10GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ss4, "Sweet", "description", "4.5", "70GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream1, "Sweet", "description", "4.5", "80GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream2, "Sweet", "description", "4.5", "90GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream3, "Sweet", "description", "4.5", "77GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream4, "Sweet", "description", "4.5", "99GEP", "10:00 _9 PM"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if (type != null && type.equalsIgnoreCase("lunch")) {

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch, "lunch", "description", "4.5", "66GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner, "lunch", "description", "4.5", "88GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver2, "lunch", "description", "4.5", "120GEP", "10:00 _9 PM"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if (type != null && type.equalsIgnoreCase("coffee")) {

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.americano, "americano", "description", "4.5", "28GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.caramel, "caramel", "description", "4.5", "22GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chocolate, "chocolate", "description", "4.5", "38GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.double_espreso, "Double Espresso", "description", "4.5", "33GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.espresso, "Espresso", "description", "4.5", "30GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lced_mocha, "Lced Mocha", "description", "4.5", "43GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.mango, "Mango", "description", "4.5", "50GEP", "10:00 _9 PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.mocha_frappe, "Mocha Frappe", "description", "4.5", "55GEP", "10:00 _9 PM"));
            detailedDailyAdapter.notifyDataSetChanged();
        }

    }
}