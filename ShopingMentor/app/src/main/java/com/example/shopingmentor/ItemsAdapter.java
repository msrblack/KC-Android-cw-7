package com.example.shopingmentor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    List<Items> Itemslist;
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        Itemslist = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);

        Items currentItems = Itemslist.get(position);

        TextView ItemsName = view.findViewById(R.id.honeyName);
        TextView Itemsprice = view.findViewById(R.id.honeyprice);
        ImageView ItemsImg = view.findViewById(R.id.honeyImg);


        ItemsName.setText(currentItems.getItemName());
        Itemsprice.setText(currentItems.getItemPrice()+"");
        ItemsImg.setImageResource(currentItems.getItemImg());


        return view;

    }
}
