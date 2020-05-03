package com.example.homepc.restauranteatitapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TraditionalFragment extends Fragment {


    public TraditionalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_traditional, container, false);

        ArrayList<TraditionalfoodClass> trad_food = new ArrayList<TraditionalfoodClass>();
        trad_food.add(new TraditionalfoodClass("Pizza1", "6$", R.drawable.pizza1,"0"));
        trad_food.add(new TraditionalfoodClass("Pizza2", "6$", R.drawable.pizza2,"0"));
        trad_food.add(new TraditionalfoodClass("Pizza1", "6$", R.drawable.pizza1,"0"));
        trad_food.add(new TraditionalfoodClass("Pizza2", "6$", R.drawable.pizza2,"0"));
        trad_food.add(new TraditionalfoodClass("Pizza1", "6$", R.drawable.pizza2,"0"));
        trad_food.add(new TraditionalfoodClass("Pizza2", "6$", R.drawable.pizza2,"0"));
        trad_food.add(new TraditionalfoodClass("Pizza1", "6$", R.drawable.pizza1,"0"));
        trad_food.add(new TraditionalfoodClass("Pizza2", "6$", R.drawable.pizza2,"0"));

        TraditionalFoodAdapter tradfoodadapter = new TraditionalFoodAdapter(getActivity(),trad_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_traditional);
        listView.setAdapter(tradfoodadapter);

        return view;
    }

}
