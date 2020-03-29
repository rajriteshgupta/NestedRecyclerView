package com.example.nestedrecycler;

import java.util.ArrayList;

public class RowModel {
    String title;
    private ArrayList<ItemModel> allItems;

    public RowModel() {
    }

    public RowModel(String title, ArrayList<ItemModel> allItems) {
        this.title = title;
        this.allItems = allItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<ItemModel> getAllItems() {
        return allItems;
    }

    public void setAllItems(ArrayList<ItemModel> allItems) {
        this.allItems = allItems;
    }
}
