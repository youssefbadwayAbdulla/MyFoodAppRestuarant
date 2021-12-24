package com.example.myfoodapprestuarant.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.activities.adapter.HomeHorAdapter;
import com.example.myfoodapprestuarant.activities.adapter.HomeVerAdapter;
import com.example.myfoodapprestuarant.activities.adapter.updataVerticalRec;
import com.example.myfoodapprestuarant.databinding.FragmentHomeBinding;
import com.example.myfoodapprestuarant.model.HomeHorModel;
import com.example.myfoodapprestuarant.model.HomeVerModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements updataVerticalRec {
    FragmentHomeBinding binding;
    RecyclerView HomeHorRecyclerView, HomeVerRecyclerView;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;
    //.................................
    ArrayList<HomeVerModel>homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        HomeHorRecyclerView = root.findViewById(R.id.home_hor_rv);
       HomeVerRecyclerView=root.findViewById(R.id.home_ver_rv);

        homeHorModelList=new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"hamburger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes,"fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream,"Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"sandwich"));
        homeHorAdapter=new HomeHorAdapter(this,homeHorModelList,getActivity());
        HomeHorRecyclerView.setAdapter(homeHorAdapter);
        HomeHorRecyclerView.setHasFixedSize(true);
        HomeHorRecyclerView.setNestedScrollingEnabled(false);

        //.....................................
        homeVerModelList=new ArrayList<>();
        homeVerAdapter=new HomeVerAdapter(homeVerModelList,getActivity());
        HomeVerRecyclerView.setAdapter(homeVerAdapter);
        return root;
    }


    @Override
    public void CallBack(int position, ArrayList<HomeVerModel> homeVerModelArrayList) {
        homeVerAdapter=new HomeVerAdapter(homeVerModelArrayList,getContext());
        homeVerAdapter.notifyDataSetChanged();
        HomeVerRecyclerView.setAdapter(homeVerAdapter);

    }
}