package com.example.foodorder.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.foodorder.R;



public class PastaFragment extends Fragment implements View.OnClickListener
{
    private Button button1,button2,button3,button4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        View v = inflater.inflate(R.layout.fragment_pasta, container, false);
        Button button1 = (Button) v.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) v.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) v.findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) v.findViewById(R.id.button4);
        button4.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button1:
                Toast.makeText(getActivity().getApplicationContext(), "Italian Pasta is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getActivity().getApplicationContext(), "White Sauce Pasta is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getActivity().getApplicationContext(), "Basil Pasta is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(getActivity().getApplicationContext(), "Primavera Pasta is selected", Toast.LENGTH_SHORT).show();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}
