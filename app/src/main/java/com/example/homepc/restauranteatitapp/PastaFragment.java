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
public class PastaFragment extends Fragment {


    public PastaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pasta, container, false);

        ArrayList<PastaClass> sea_food = new ArrayList<PastaClass>();
        sea_food.add(new PastaClass("Pasta1", "6$", R.drawable.pasta1,"0"));
        sea_food.add(new PastaClass("Pasta2", "6$", R.drawable.pasta2,"0"));
        sea_food.add(new PastaClass("Pasta1", "6$", R.drawable.pasta1,"0"));
        sea_food.add(new PastaClass("Pasta2", "6$", R.drawable.pasta2,"0"));
        sea_food.add(new PastaClass("Pasta1", "6$", R.drawable.pasta1,"0"));
        sea_food.add(new PastaClass("Pasta2", "6$", R.drawable.pasta2
                ,"0"));


        PastaAdapter seaadapter = new PastaAdapter(getActivity(),sea_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_sea);
        listView.setAdapter(seaadapter);





        return view;
    }

}
