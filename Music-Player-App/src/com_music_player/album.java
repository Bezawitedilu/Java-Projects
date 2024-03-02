package com_music_player;

import java.util.ArrayList;

public class album {
    private String name;
    private String artist;
    private ArrayList<song> songs;

    public album(String name, String artist, ArrayList<song> Songs){
        this.name = name;
        this.artist= artist;
        this.songs= new ArrayList<song>();
    }

    public album(){

    }

    public song findSong(String title) {
        for (song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }
    //true when song is added, false when song is not added
    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            songs.add(new song(title,duration));
            System.out.println(title+" successfully added to the list");
            return true;
        }

        else {
            System.out.println("Song with name " + title + " already exists!");
            return false;
        }

        }

        public boolean addToPlayList(int trackNumber, )
    }



