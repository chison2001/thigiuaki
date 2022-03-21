package com.example.a19508751_lechison;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private ArrayList<Product> itemList;

    public ProductAdapter(Context context, int idLayout, ArrayList<Product> itemList) {
        this.context = context;
        this.idLayout = idLayout;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return  itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context)
                .inflate(idLayout, viewGroup, false);

        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView tvShip = (TextView) view.findViewById(R.id.tvShip);
        TextView tvNewPrice = (TextView) view.findViewById(R.id.tvPriceNew);
        TextView tvOldPrice = (TextView) view.findViewById(R.id.tvPriceOld);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewProduct);
        final Product product = itemList.get(i);

        tvName.setText(product.getName());
        tvShip.setText(product.getShip());
        tvNewPrice.setText(product.getNewPrice());
        tvOldPrice.setText(product.getOldPrice());
        int idLanguage = product.getId();
        switch (idLanguage) {
            case 1:
                imageView.setImageResource(R.drawable.bione_removebg_preview);
                break;
            case 2:
                imageView.setImageResource(R.drawable.bifour__removebg_preview);
                break;
            default:
                break;
        }



        return view;
    }
}
