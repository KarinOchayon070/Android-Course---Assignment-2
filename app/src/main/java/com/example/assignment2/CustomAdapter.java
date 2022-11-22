package com.example.assignment2;

//import android.support.annotation.NonNull;
//import android.support.v7.widget.CardView;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>  {

    private ArrayList<DataModel> dataSet;

    public CustomAdapter(ArrayList<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder  {
        CardView cardView;
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public MyViewHolder (View itemView )
        {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.card_view);
            textViewName = ( TextView) itemView.findViewById(R.id.textViewName);
            textViewVersion = ( TextView) itemView.findViewById(R.id.textViewVersion);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);

        }

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_blank_four , parent ,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

//        MyViewHolder myViewHolder = new MyViewHolder(view);

//        ImageView imageView = vHolder.imageViewIcon;

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder,  int listPosition) {

        TextView textViewName = viewHolder.textViewName;
        TextView textViewVersion = viewHolder.textViewVersion;
        ImageView imageView = viewHolder.imageViewIcon;
        CardView cardView = viewHolder.cardView;

        if(textViewName.getText() != null){
            textViewName.setText(dataSet.get(listPosition).getName());
        }
        if(textViewVersion.getText() != null){
            textViewVersion.setText(dataSet.get(listPosition).getDescriptionArray());
        }
        if(imageView != null){
            imageView.setImageResource(dataSet.get(listPosition).getImage());
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                BlankFragmentTwo blankFragmentTwo = new BlankFragmentTwo();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_blank_four,blankFragmentTwo).commit();
                //TextView textViewName1 = view.findViewById(R.id.textView);
                //ImageView imageView1 = view.findViewById(R.id.imageView2);
                //textViewName1.setText("frjfrkfnrk");
                //Navigation.findNavController(view).navigate(R.id.action_blankFragmentFour_to_blankFragmentTwo);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}


