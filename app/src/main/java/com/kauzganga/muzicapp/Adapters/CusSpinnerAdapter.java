package com.kauzganga.muzicapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.kauzganga.muzicapp.R;

import java.util.ArrayList;

public class CusSpinnerAdapter extends ArrayAdapter<String> {
    public CusSpinnerAdapter(@NonNull Context context, ArrayList<String> titles) {
        super(context, 0, titles);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String word = getItem(position);

        // Adapters recycle views to AdapterViews.
        // If this is a new View object we're getting, then inflate the layout.
        // If not, this view already has the layout inflated from a previous call to getView,
        // and we modify the View widgets as usual.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.recycler_item, parent, false);
        }


        //TextView versionNameView = (TextView) convertView.findViewById(R.id.word_item_version);
        //versionNameView.setText(word.versionName);
        TextView songTitleView = convertView.findViewById(R.id.song_title);
        songTitleView.setText(word);
        TextView artistView = convertView.findViewById(R.id.artist);
        artistView.setText(word);
        TextView albumNameView = convertView.findViewById(R.id.album_name);
        albumNameView.setText(word);
       // TextView versionNumberView = (TextView) convertView.findViewById(R.id.word_item_number);
       // versionNumberView.setText(word.versionNumber);
        return convertView;
    }
}
