package com.planzy.planzyai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nitish.typewriterview.TypeWriterView;

import java.util.ArrayList;

public class AI_ChatbotAdapter extends RecyclerView.Adapter<AI_ChatbotAdapter.ViewHolder> {
    Context context;
    ArrayList<AI_chatbot_model> chat_array;
    int user_sent = 0;
    int ai_sent = 1;

    public AI_ChatbotAdapter(Context context, ArrayList<AI_chatbot_model> chat_array) {
        this.context = context;
        this.chat_array = chat_array;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.individual_chat_by_user, parent, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }
        else {
            View view = LayoutInflater.from(context).inflate(R.layout.individual_chat_by_ai, parent, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(chat_array.get(position).isSent_by_ai()){
            return ai_sent;
        }
        else{
            return user_sent;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(chat_array.get(holder.getAdapterPosition()).getCharacter_name());
        holder.text.avoidTextOverflowAtEdge(false);
        if(chat_array.get(holder.getAdapterPosition()).isTyping_animation_required()){
            holder.text.animateText(chat_array.get(holder.getAdapterPosition()).getBody());
            chat_array.get(holder.getAdapterPosition()).setTyping_animation_required(false);
        }
        else{
            holder.text.setText(chat_array.get(holder.getAdapterPosition()).getBody());
        }
    }

    @Override
    public int getItemCount() {
        return chat_array.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TypeWriterView text;
        TextView name;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.individual_chat_pic);
            text = itemView.findViewById(R.id.individual_chat_text);
            name = itemView.findViewById(R.id.individual_chat_name);
        }
    }
}
