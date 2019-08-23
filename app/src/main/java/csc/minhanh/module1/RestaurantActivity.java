package csc.minhanh.module1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    RecyclerView rvFood;
    ArrayList<Food> foods;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        rvFood = findViewById(R.id.rvFood);
        foods = new ArrayList<>();
        foods.add(new Food(R.drawable.ic_banh_mi,"Banh Mi","15000 VND"));
        foods.add(new Food(R.drawable.ic_black_coffee,"Black Coffee","10000 VND"));
        foods.add(new Food(R.drawable.ic_milk_tea,"Milk Tea","25000 VND"));
        foods.add(new Food(R.drawable.ic_banh_mi,"Banh Mi","15000 VND"));
        foods.add(new Food(R.drawable.ic_black_coffee,"Black Coffee","10000 VND"));
        foods.add(new Food(R.drawable.ic_milk_tea,"Milk Tea","25000 VND"));
        foods.add(new Food(R.drawable.ic_banh_mi,"Banh Mi","15000 VND"));
        foods.add(new Food(R.drawable.ic_black_coffee,"Black Coffee","10000 VND"));
        foods.add(new Food(R.drawable.ic_milk_tea,"Milk Tea","25000 VND"));
        foodAdapter = new FoodAdapter(this,foods);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RestaurantActivity.this,RecyclerView.VERTICAL,false);

        rvFood.setAdapter(foodAdapter);
        rvFood.setLayoutManager(layoutManager);

    }
}
