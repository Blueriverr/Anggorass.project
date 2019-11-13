package com.azhar.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void food(View view) {
        Intent food= new Intent(MainActivity.this, FoodActivity.class);
        startActivity(food);
    }
    public void place(View view) {
        Intent place= new Intent(MainActivity.this, PlaceActivity.class);
        startActivity(place);
    }

    public void rate(View view) {
        Intent rate= new Intent(MainActivity.this, RatingActivity.class);
        startActivity(rate);
    }
}
