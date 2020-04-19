package com.example.gorceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class Checkout_Activity extends AppCompatActivity {
    private TextView Name;
    private TextView Category;
    private TextView Price;
    private ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Name = (TextView)findViewById(R.id.productName);
        Category=(TextView)findViewById(R.id.info);
       Price=(TextView)findViewById(R.id.price);
        img=(ImageView)findViewById(R.id.image);

        final Intent intent = getIntent();
       final String name = intent.getExtras().getString("Title");
        final String category = intent.getExtras().getString("Category");
        final String price = intent.getExtras().getString("Price");
        int image = intent.getExtras().getInt("Image");

           Name.setText(name);
            Category.setText(category);
            img.setImageResource(image);
            Price.setText(price);
            Button button = (Button)findViewById(R.id.checkout);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "Order Summary" + "\n" + img + "\n" + price +  "\n" + name +  "\n"+ category);
                    sendIntent.setType("text/plain");
                    Intent shareIntent = Intent.createChooser(sendIntent, null);
                    startActivity(shareIntent);
                }
            });

    }
}
