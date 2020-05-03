package com.example.homepc.restauranteatitapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ContinentalAdapter extends ArrayAdapter<ContinentalClass> {

    int Contiquantity = 0; int i = 0;
    int Contivalue = 0; String Contihold = "";
    int Contipos = 0, Conticounter = 1;
    String [] Contiorder_details = new String[1000];
    DatabaseHelper mydb;
    String Number,Name,Quantity,Price = "";

    public ContinentalAdapter(Activity context, ArrayList<ContinentalClass> conti_food) {
        super(context, 0, conti_food);
        this.mydb = new DatabaseHelper(context.getApplicationContext());

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.menu_design, parent, false);
        }

        ContinentalClass currentcontifood = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image);
        imageView.setImageResource(currentcontifood.getImageResourceId());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        nameTextView.setText(currentcontifood.getItemName());


        TextView priceTextView = (TextView) listItemView.findViewById(R.id.item_price);
        priceTextView.setText("Price " + currentcontifood.getItemPrice() );


        Button plus = (Button) listItemView.findViewById(R.id.plus_btn);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contiquantity = Contiquantity + 1;

            }
        });

        Button minus = (Button) listItemView.findViewById(R.id.minus_btn);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Contiquantity > 0) Contiquantity = Contiquantity + 1;
                else Contiquantity = Contiquantity;

            }
        });

        Contihold = currentcontifood.getItemquantity();
        Contivalue = Integer.parseInt(Contihold);
        Contiquantity = Contivalue + Contiquantity;

        TextView quantityTextView = (TextView) listItemView.findViewById(R.id.quantity);
        quantityTextView.setText(String.valueOf(Contiquantity));

        Button cart_btn = (Button) listItemView.findViewById(R.id.cart_btn);
        cart_btn.setTag(position);

        cart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //cart_btn.setEnabled(false);
                Contipos = (Integer)view.getTag();


            }
        });


        return listItemView;
    }
}
