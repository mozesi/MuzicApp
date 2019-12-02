package com.kauzganga.muzicapp.Adapters;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kauzganga.muzicapp.NowPlaying;
import com.kauzganga.muzicapp.R;
import com.kauzganga.muzicapp.Song;

public class SongViewHolder extends RecyclerView.ViewHolder {
    public static String SONG_TITLE = "songTitle";
    public static String ARTIST_NAME = "artistName";
    public static String ALBUM_NAME = "albumName";

    private TextView songTitleView;
    private TextView artistView;
    private TextView albumNameView;
    private ImageButton playSongButton;

    public SongViewHolder(@NonNull final View itemView) {
        super(itemView);
        songTitleView = itemView.findViewById(R.id.song_title);
        artistView = itemView.findViewById(R.id.artist);
        albumNameView = itemView.findViewById(R.id.album_name);
        playSongButton = itemView.findViewById(R.id.play_button);
        /**
         * activate the play button for a listed song
         * and start the now playing activity with the song details
         */
        playSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSong = new Intent(itemView.getContext(), NowPlaying.class);
                playSong.putExtra(SONG_TITLE, songTitleView.getText());
                playSong.putExtra(ARTIST_NAME, artistView.getText());
                playSong.putExtra(ALBUM_NAME, albumNameView.getText());
                itemView.getContext().startActivity(playSong);

            }
        });

    }

    /**
     * This method sets the values from the song to the view items
     *
     * @param mSong
     */
    public void setViewItems(Song mSong) {
        songTitleView.setText(mSong.getTitle());
        artistView.setText(mSong.getArtist());
        albumNameView.setText(mSong.getAlbum());
    }
}
