package com.kauzganga.muzicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.kauzganga.muzicapp.Adapters.CusSpinnerAdapter;
import com.kauzganga.muzicapp.Adapters.SongViewHolder;

import java.util.ArrayList;

public class NowPlaying extends AppCompatActivity {

    Button musicLibrary;
    ImageButton playSong;
    ImageButton playNextSong;
    ImageButton playPreviousSong;
    Spinner songTitleSpinner;

    TextView songTitleView;
    TextView albumName;
    TextView artistName;

    ArrayList<String> songTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        musicLibrary = findViewById(R.id.btn_music_library);
        songTitleView = findViewById(R.id.playing_now_song_title);
        albumName = findViewById(R.id.playing_now_album_title);
        artistName = findViewById(R.id.playing_now_artist_name);
        songTitleSpinner = findViewById(R.id.spinner_songs);

        playSong = findViewById(R.id.btn_play);
        playNextSong = findViewById(R.id.btn_next);
        playPreviousSong = findViewById(R.id.btn_previous);

        songTitles = new ArrayList<String>();
        int songs =0;
        while(songs < 20) {
            songTitles.add("Ndiwe Mbambande ");

            songs++;
        }
       // ArrayAdapter<String> songArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,songTitles);
        CusSpinnerAdapter  songArrayAdapter = new CusSpinnerAdapter(this,songTitles);
        songArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        songTitleSpinner.setAdapter(songArrayAdapter);

        playSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "playing song", Toast.LENGTH_SHORT).show();
            }
        });
        playNextSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "play next song", Toast.LENGTH_SHORT).show();
            }
        });
        playPreviousSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "play previous song", Toast.LENGTH_SHORT).show();
            }
        });
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicLibrary = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(musicLibrary);
            }
        });
        // getting the intent to extract the passed song values
        Intent playMusicIntent = getIntent();
        if (playMusicIntent != null) {
            // get the intent passed strings and set the textViews
            songTitleView.setText(playMusicIntent.getStringExtra(SongViewHolder.SONG_TITLE));
            albumName.setText(playMusicIntent.getStringExtra(SongViewHolder.ALBUM_NAME));
            artistName.setText(playMusicIntent.getStringExtra(SongViewHolder.ARTIST_NAME));
        }
    }
}
