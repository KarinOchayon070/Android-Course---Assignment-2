package com.example.assignment2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}



public class MainActivity extends AppCompatActivity {


    private ArrayList<DataModel> dataSet;

    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;
    private CustomAdapter addapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank_three);

        recycleView = (RecyclerView) findViewById(R.id.my_recycler_view);

        layoutManager = new LinearLayoutManager(this); // new GridLayoutManager
        recycleView.setLayoutManager(layoutManager);

        recycleView.setItemAnimator(new DefaultItemAnimator());

        dataSet = new ArrayList<DataModel>();

        for(int i=0 ; i<MyData.nameArray.length ; i++)
        {
            dataSet.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.descriptionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }

        addapter = new CustomAdapter(dataSet);
        recycleView.setAdapter(addapter);

    }

}



