package com.example.a19508751_lechison;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ArrayList<Product> productArrayList;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView =  findViewById(R.id.listView);
        productArrayList = new ArrayList<>();
        productArrayList.add(new Product(1, "Red Bull One", "Free Ship","$ 350", "$449"));
        productArrayList.add(new Product(2, "Blue One ", "Free Ship", "$ 840", "$950"));
        ProductAdapter adapter = new ProductAdapter(this, R.layout.customlistview, productArrayList);
        listView.setAdapter(adapter);

    }
}