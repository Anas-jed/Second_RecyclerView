package com.example.pc.second_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //MyList of Flags
    private List<Flags> flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList = findViewById(R.id.programmingList);

        //setting LayoutManager with Grid
        programmingList.setLayoutManager(new GridLayoutManager(this,4));

        //All my Flags list with name and image reference
        flag = new ArrayList<>();
        flag.add(new Flags("Pakistan",R.drawable.pakistan));
        flag.add(new Flags("India",R.drawable.india));
        flag.add(new Flags("Turkey",R.drawable.turkey));
        flag.add(new Flags("Argentina",R.drawable.argentina));
        flag.add(new Flags("SaudiArabia",R.drawable.saudiarabia));
        flag.add(new Flags("UAE",R.drawable.unitedarabemirates));
        flag.add(new Flags("UK",R.drawable.unitedkingdom));
        flag.add(new Flags("Kuwait",R.drawable.kuwait));
        flag.add(new Flags("Japan",R.drawable.japan));
        flag.add(new Flags("Cyprus",R.drawable.cyprus));
        flag.add(new Flags("Canada",R.drawable.canada));
        flag.add(new Flags("Australia",R.drawable.australia));
        flag.add(new Flags("Algeria",R.drawable.algeria));
        flag.add(new Flags("Switzerland",R.drawable.switzerland));
        flag.add(new Flags("Finland",R.drawable.finland));
        flag.add(new Flags("Tunisia",R.drawable.tunisia));

        //setting Adapter
        programmingList.setAdapter(new ProgrammingAdapter(this,flag));

    }
}
