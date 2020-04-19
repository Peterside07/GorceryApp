package com.example.gorceryapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recyclerview_adapter  extends RecyclerView.Adapter<Recyclerview_adapter.viewholder> {

    private Context context;

    public Recyclerview_adapter(Context context, List<Food_data> mData) {
        this.context = context;
        this.mData = mData;
    }

    private List<Food_data> mData;

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater  layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.view_card, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, final int position) {
        holder.textView.setText(mData.get(position).getFoodname());
        holder.imageView.setImageResource(mData.get(position).getAmount());
        holder.textView1.setText(mData.get(position).getPrice());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Checkout_Activity.class);
                intent.putExtra("Title", mData.get(position).getFoodname());
                // info
                intent.putExtra("Category", mData.get(position).getCategory());
                //product name
                intent.putExtra("Price", mData.get(position).getPrice());
                //image
                intent.putExtra("Image", mData.get(position).getAmount());
                context.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class viewholder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        TextView textView1;
        CardView cardView;


        public viewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.food_items_img);
            textView= itemView.findViewById(R.id.food_items);
            textView1=itemView.findViewById(R.id.price);
            cardView= itemView.findViewById(R.id.cardview);
        }
    }
}
