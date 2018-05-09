package com.example.dellpc.actionbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private ArrayList<Card> cards;
    private Context context;
    public RecyclerViewAdapter (ArrayList<Card> myValues,Context context){
        this.cards= myValues;
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Card card = cards.get(position);
        holder.myTextView.setText(card.getTitle());
        holder.content1.setText(card.getContent1());
    }


    @Override
    public int getItemCount() {
        return cards.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView myTextView;
        private  TextView content1;
        public MyViewHolder(View itemView) {
            super(itemView);
            myTextView = (TextView)itemView.findViewById(R.id.text_cardview);
            content1=(TextView) itemView.findViewById(R.id.content1);
        }
    }
}
