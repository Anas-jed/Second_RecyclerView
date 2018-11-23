package com.example.pc.second_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
//Adapter class
public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private List<Flags> data;
    private Context fcontext;
    public ProgrammingAdapter(Context ffcontext,List<Flags> data) //Adapter Constructor
    {
        this.fcontext = ffcontext;
        this.data = data;
    }
    @NonNull
    @Override
    //Three Abstract Methods
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());//Inflater for filling Views
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    //Binding method for binding views with viewholder in Runtime
    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder,final int i) {

        holder.textView.setText(data.get(i).getTitle());
        holder.imgIcon.setImageResource(data.get(i).getImg_url());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Opening Individual Flag
                Intent intent = new Intent(fcontext,Individual_Flag.class);

                //passing data to the individual flag activity
                intent.putExtra("Flag_Name",data.get(i).getTitle());
                intent.putExtra("Flag_Image",data.get(i).getImg_url());
                //start the individual flag activity
                fcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    //ViewHolder Class
    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView textView;
        CardView cardView;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.flag_img);
            textView = (TextView) itemView.findViewById(R.id.flag_text);
            cardView = (CardView) itemView.findViewById(R.id.Cardview);
        }
    }
}
