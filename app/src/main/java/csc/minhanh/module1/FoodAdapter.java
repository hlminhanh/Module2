package csc.minhanh.module1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodVH>{

    Context context;
    ArrayList<Food> foods;

    public FoodAdapter(Context context, ArrayList<Food> foods) {
        this.context = context;
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View convertView = layoutInflater.inflate(R.layout.layout_item_food,null,false);
        return new FoodVH(convertView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodVH holder, int position) {
        Food food = foods.get(position);
        holder.imvFood.setImageResource(food.getHinhfood());
        holder.txtNameFood.setText(food.getTenfood());
        holder.txtPriceFood.setText(food.getGiafood());

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    class FoodVH extends RecyclerView.ViewHolder {
        ImageView imvFood;
        TextView txtNameFood, txtPriceFood;
        public FoodVH(@NonNull View itemView) {
            super(itemView);

            imvFood = itemView.findViewById(R.id.imvFood);
            txtNameFood = itemView.findViewById(R.id.txtNameFood);
            txtPriceFood = itemView.findViewById(R.id.txtPriceFood);
        }
    }
}
