package com.example.nestedrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RowListAdapter extends RecyclerView.Adapter<RowListAdapter.SingleItemHolder> {

    private ArrayList<ItemModel> itemsList;
    private Context mContext;

    public RowListAdapter(ArrayList<ItemModel> itemsList, Context mContext) {
        this.itemsList = itemsList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public SingleItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, null);
        SingleItemHolder mh = new SingleItemHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(SingleItemHolder singleItemHolder, int position) {
        ItemModel singleItem = itemsList.get(position);
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class SingleItemHolder extends RecyclerView.ViewHolder {

        protected ImageView itemImage;

        public SingleItemHolder(View view) {
            super(view);

            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);
        }
    }
}