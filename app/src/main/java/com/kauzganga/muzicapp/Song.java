package com.kauzganga.muzicapp;

public class Song {
    private String title;
    private String artist;
    private String album;

    public Song(String mTitle, String mArtist, String mAlbum) {
        this.title = mTitle;
        this.artist = mArtist;
        this.album = mAlbum;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}
