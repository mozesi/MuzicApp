package com.kauzganga.muzicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kauzganga.muzicapp.Adapters.SongsAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager layoutManager;
    public ArrayList<Song> songs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * add all songs to the array list
         */
        {
            songs.add(new Song("Ungonena freestyle", "Blaze", "Unknown"));
            songs.add(new Song("Nelia", "Saint", "Unknown"));
            songs.add(new Song("Pumani", "Dan Lu", "Unknown"));
            songs.add(new Song("Michael Yekha", "Phyzix", "Unknown"));

            songs.add(new Song("Undigaile", "2kay & Saint", "Unknown"));
            songs.add(new Song("Uli ndi vuto", "Mwanache", "Unknown"));
            songs.add(new Song("Pretending", "Dan Lu", "Unknown"));
            songs.add(new Song("Mwana Uyu", "Kelvin Sings & Suffix", "Unknown"));

            songs.add(new Song("Sister wa Mwanache", "Toria", "Unknown"));
            songs.add(new Song("Msilikali", "NesNes", "Unknown"));
            songs.add(new Song("A Rozi", "Hyphen", "Unknown"));
            songs.add(new Song("Ine Ndi ghetto", "SevenOmore", "Unknown"));
        }
        /**
         *Get a reference to the RecyclerView, and set the layout manager and attach the adapter to it.
         */
        RecyclerView recyclerView = findViewById(R.id.recyler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new SongsAdapter(songs));
    }
}

