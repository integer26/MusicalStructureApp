package com.example.android.musicalstructureapp;


public class Song {

    private String mName, mAuthor;

    public Song(String Name, String Author) {

        mName = Name;
        mAuthor = Author;

    }

    public String getmName() {
        return mName;
    }

    public String getmAuthor() {
        return mAuthor;
    }
}
