package com.planzy.planzyai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;


public class PlanViewAdapter extends RecyclerView.Adapter<PlanViewAdapter.ViewHolder>{
    Context context;
    ArrayList<ModelPlanView> array_plans;
    public PlanViewAdapter(Context context, ArrayList<ModelPlanView> array_plans) {
        this.context = context;
        this.array_plans = array_plans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.individual_planview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int price = array_plans.get(holder.getAdapterPosition()).getPrice();
        holder.price.setText("test");
        ArrayList<String> temp = array_plans.get(holder.getAdapterPosition()).getIncludedlist();
        holder.text1.setText(temp.get(0));
        holder.text2.setText(temp.get(1));
        holder.text3.setText(temp.get(2));

    }

    @Override
    public int getItemCount() {
        return array_plans.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView price, text1, text2, text3;
        MaterialButton button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            price = itemView.findViewById(R.id.indi_price);
            button = itemView.findViewById(R.id.indi_choosebtn);
            text1 = itemView.findViewById(R.id.indi_text1);
            text2 = itemView.findViewById(R.id.indi_text2);
            text3 = itemView.findViewById(R.id.indi_text3);

        }
    }
}
