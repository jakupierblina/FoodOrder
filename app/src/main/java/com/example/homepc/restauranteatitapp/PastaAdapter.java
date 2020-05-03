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


public class PastaAdapter extends ArrayAdapter<PastaClass> {
    int quantity = 0; int i = 0;
    int pos = 0;
    DatabaseHelper mydb;


    public PastaAdapter(Activity context, ArrayList<PastaClass> pasta_array) {
        super(context, 0, pasta_array);
        this.mydb = new DatabaseHelper(context.getApplicationContext());

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.menu_design, parent, false);
        }


        PastaClass currentseafood = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        nameTextView.setText(currentseafood.getItemName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image);
        imageView.setImageResource(currentseafood.getImageResourceId());

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.item_price);
        priceTextView.setText("Price " + currentseafood.getItemPrice());




        TextView quantityTextView = (TextView) listItemView.findViewById(R.id.quantity);
        quantityTextView.setText(String.valueOf(quantity));

        Button cart_btn = (Button) listItemView.findViewById(R.id.cart_btn);
        cart_btn.setTag(position);

        cart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cart_btn.setEnabled(false);
                pos = (Integer)view.getTag();


            }
        });

        return listItemView;

    }
}
