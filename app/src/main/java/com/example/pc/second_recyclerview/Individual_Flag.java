package com.example.pc.second_recyclerview;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Individual_Flag extends AppCompatActivity { //My Second Activity Class displaying Indiviual Flag Name and Image

    private TextView flag_name;
    private ImageView flag_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_flag);

        flag_name = (TextView) findViewById(R.id.flag_name);
        flag_img = (ImageView) findViewById(R.id.flag_img);


        Intent intent= getIntent();

        //Recieve Data
        String Name = intent.getExtras().getString("Flag_Name");
        int Img = intent.getExtras().getInt("Flag_Image");

        //setting Values
        flag_img.setImageResource(Img);
        flag_name.setText(Name);
    }
}
