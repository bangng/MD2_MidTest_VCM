package rikkei.academy.controller;

import rikkei.academy.model.Singer;
import rikkei.academy.model.Song;
import rikkei.academy.service.Singer.SingerServiceIPL;
import rikkei.academy.service.Singer.SongServiceIPL;

import java.util.List;
import java.util.Scanner;

public class SongController {
    private final SingerController singerController = new SingerController();


    private final SongServiceIPL songServiceIPL = new SongServiceIPL();
    public List<Song> songList(){
        return songServiceIPL.findAll();
    }
    public void addSong(Song song){
        songServiceIPL.save(song);
    }
    public void deleteSong(int id){
        songServiceIPL.deleteById(id);
    }
    public void editSong(int id, Song song){
        songServiceIPL.edit(id, song);
    }
    public Song detailSong(int id){
        return songServiceIPL.findById(id);
    }
    public void sortSong(){
      songServiceIPL.sort();

    }

}
