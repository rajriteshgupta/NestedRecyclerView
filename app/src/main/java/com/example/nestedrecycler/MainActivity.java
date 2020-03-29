package com.example.nestedrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<RowModel> allData;
    RecycleViewAdapter recycleViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allData = new ArrayList<RowModel>();
        createDummyData();
        recyclerView = findViewById(R.id.outer_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recycleViewAdapter = new RecycleViewAdapter(allData,this);
        recyclerView.setAdapter(recycleViewAdapter);
    }

    public void createDummyData() {
        for (int i = 1; i <= 1; i++) {
            RowModel dm = new RowModel();
            dm.setTitle("Section " + i);
            ArrayList<ItemModel> singleItem = new ArrayList<ItemModel>();
            for (int j = 1; j <= 2; j++) {
                singleItem.add(new ItemModel());
            }
            dm.setAllItems(singleItem);
            allData.add(dm);
        }

        for (int i = 2; i <= 3; i++) {
            RowModel dm = new RowModel();
            dm.setTitle("Section " + i);
            ArrayList<ItemModel> singleItem = new ArrayList<ItemModel>();
            for (int j = 1; j <= 8; j++) {
                singleItem.add(new ItemModel());
            }
            dm.setAllItems(singleItem);
            allData.add(dm);
        }

        for (int i = 4; i <= 6; i++) {
            RowModel dm = new RowModel();
            dm.setTitle("Section " + i);
            allData.add(dm);
        }

        for (int i = 7; i <= 8; i++) {
            RowModel dm = new RowModel();
            ArrayList<ItemModel> singleItem = new ArrayList<ItemModel>();
            for (int j = 1; j <= 8; j++) {
                singleItem.add(new ItemModel());
            }
            dm.setAllItems(singleItem);
            allData.add(dm);
        }
    }
}

