package com.example.diptamahardhika.demolistview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dipta Mahardhika on 10/15/2015.
 */
public class LemaAdapter extends RecyclerView.Adapter<LemaAdapter.MyViewHolder> {
    private LayoutInflater inflater;

    List<Lema> data = Collections.emptyList();

    public LemaAdapter(Context context, List<Lema> data){
       inflater = LayoutInflater.from(context);
        this.data=data;
    }



//    public LemaAdapter(Context context, ArrayList<Lema> lemas) {
//        super (context, 0, lemas);
//    }

//    public View getView(int position, View convertView, ViewGroup parent) {
//        // Get the data item for this position
//        Lema lema = getItem(position);
//        // Check if an existing view is being reused, otherwise inflate the view
//        if (convertView == null) {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.da_items, parent, false);
//        }
//        // Lookup view for data population
//        TextView kanji_box = (TextView) convertView.findViewById(R.id.kanji_box);
//        TextView furigana_box = (TextView) convertView.findViewById(R.id.furigana_box);
//        TextView meaning_box = (TextView) convertView.findViewById(R.id.meaning_box);
//        // Populate the data into the template view using the data object
//        kanji_box.setText(lema.item_eng);
//        furigana_box.setText(lema.item_ind);
//        meaning_box.setText(lema.item_meaning);
//        // Return the completed view to render on screen
//        return convertView;
//    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {
       View view = inflater.inflate(R.layout.da_items,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Lema current= data.get(position);
        holder.kanji_box.setText(current.item_eng);
        holder.furigana_box.setText(current.item_ind);
        holder.meaning_box.setText(current.item_meaning);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView kanji_box ;
        TextView furigana_box ;
        TextView meaning_box ;


        public MyViewHolder(View itemView) {
            super(itemView);
            kanji_box = (TextView) itemView.findViewById(R.id.kanji_box);
            furigana_box = (TextView) itemView.findViewById(R.id.furigana_box);
            meaning_box = (TextView) itemView.findViewById(R.id.meaning_box);
        }
    }

}
