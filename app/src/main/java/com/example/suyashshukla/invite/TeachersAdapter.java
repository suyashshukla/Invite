package com.example.suyashshukla.invite;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Suyash Shukla on 25-Oct-17.
 */

public class TeachersAdapter extends ArrayAdapter<Teachers> {

    public TeachersAdapter(Activity Context, ArrayList<Teachers> tlist)
    {
        super(Context,0,tlist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.teachers_name,parent,false);
        }

        Teachers teacher = getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(teacher.getName());

        TextView designation = listItemView.findViewById(R.id.designation);
        designation.setText(teacher.getDesignation());

        ImageView andro = listItemView.findViewById(R.id.andro);
        andro.setImageResource(teacher.getAndroid_src());

        return listItemView;
    }
}
