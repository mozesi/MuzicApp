package com.kauzganga.muzicapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kauzganga.muzicapp.R;
import com.kauzganga.muzicapp.Song;

import java.util.ArrayList;

public class SongsAdapter extends RecyclerView.Adapter<SongViewHolder> {

    public ArrayList<Song> Songs;

    /**
     * constructor
     *
     * @param mSongs
     */
    public SongsAdapter(ArrayList<Song> mSongs) {
        this.Songs = mSongs;
    }

    /**
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View songRecyclerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new SongViewHolder(songRecyclerView);
    }

    /**
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        holder.setViewItems(Songs.get(position));
    }

    /**
     * @return the size of the array list of songs
     */
    @Override
    public int getItemCount() {
        return Songs.size();
    }
}
