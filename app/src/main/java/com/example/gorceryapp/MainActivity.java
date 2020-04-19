package com.example.gorceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Food_data> food_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //item arraylist
        food_data = new ArrayList<>();
        food_data.add(new Food_data("Semo", "A local Nigeria food ", "900", R.drawable.egusi));
        food_data.add(new Food_data("Food", "A local Nigeria food ", "900", R.drawable.food1));
        food_data.add(new Food_data("Semo", "A local Nigeria food ", "900", R.drawable.food2));
        food_data.add(new Food_data("Apple", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.  ", "500", R.drawable.apple));
        food_data.add(new Food_data("Coconut", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.", "800.99", R.drawable.coconut));
        food_data.add(new Food_data("Milk", "This is a great evaporated milk for your breakfast cereal and for cooking as well.", "700", R.drawable.milk));
        food_data.add(new Food_data("Milk", "This is a great evaporated milk for your breakfast cereal and for cooking as well.", "700", R.drawable.milk1));
        food_data.add(new Food_data("Milk", "This is a great evaporated milk for your breakfast cereal and for cooking as well.", "700", R.drawable.cowbell));
        food_data.add(new Food_data("Milk", "This is a great evaporated milk for your breakfast cereal and for cooking as well.", "700", R.drawable.dano));
        food_data.add(new Food_data("Milk", "This is a great evaporated milk for your breakfast cereal and for cooking as well.", "700", R.drawable.peak));
        food_data.add(new Food_data("Milk", "This is a great evaporated milk for your breakfast cereal and for cooking as well.", "700", R.drawable.milk));
        food_data.add(new Food_data("Banana", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.", "500", R.drawable.banana1));
        food_data.add(new Food_data("Apple", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.  ", "500", R.drawable.apple));
        food_data.add(new Food_data("Coconut", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.", "800.99", R.drawable.coconut));
        food_data.add(new Food_data("PawPaw", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.", "500", R.drawable.pawpaw));
        food_data.add(new Food_data("Lemon", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.  ", "500", R.drawable.lemon));
        food_data.add(new Food_data("Apple", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.  ", "500", R.drawable.apple));
        food_data.add(new Food_data("Coconut", "Fruits are very healthy and nutritious. You get the most health benefits from fruits when you eat them fresh.", "800.99", R.drawable.coconut));





        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
      Recyclerview_adapter recyclerview_adapter = new Recyclerview_adapter(this,food_data);
      recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
      recyclerView.setAdapter(recyclerview_adapter);

      recyclerView.setHasFixedSize(true);
    }
}
