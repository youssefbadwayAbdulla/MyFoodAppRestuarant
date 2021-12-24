package com.example.myfoodapprestuarant.ui.dailyMeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.activities.adapter.DailyMealAdapter;
import com.example.myfoodapprestuarant.model.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerViewDailyMeal;
    DailyMealAdapter dailyMealAdapter;
    List<DailyMealModel> dailyMealModelList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);
        recyclerViewDailyMeal = root.findViewById(R.id.daily_meal_rv);
        dailyMealModelList = new ArrayList<>();
        dailyMealModelList.add(new DailyMealModel(R.drawable.breakfast, "Brackfast", "30% OFF", "Description","breakfast"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.lunch, "Lunch", "35% OFF", "Description","lunch"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.dinner, "Dinner", "45% OFF", "Description","dinner"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.sweets, "Sweets", "39% OFF", "Description","Sweets"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.coffe, "Coffee", "20% OFF", "Description","coffee"));
        dailyMealAdapter = new DailyMealAdapter(dailyMealModelList, getContext());
        recyclerViewDailyMeal.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }


}