package rikkei.academy.service.Singer;

import rikkei.academy.controller.SongController;
import rikkei.academy.model.Singer;
import rikkei.academy.model.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SongServiceIPL implements ISongService{
    Scanner scanner = new Scanner(System.in);

    static List<Song> listSong = new ArrayList<>();
    static {
        listSong.add(new Song (1,"one"));
        listSong.add(new Song (2,"two"));
        listSong.add(new Song (3,"three"));
        listSong.add(new Song (4,"four"));
        listSong.add(new Song (5,"five"));

    }
    @Override
    public List<Song> findAll() {
        return listSong;
    }

    @Override
    public void save(Song song) {
        listSong.add(song);

    }

    @Override
    public void deleteById(int id) {
        listSong.remove(id - 1);
        upDateId();

    }
    private void upDateId(){
        for (int i = 0; i < listSong.size(); i++){
            listSong.get(i).setId(i+1);
        }
    }

    @Override
    public Song findById(int id) {
        return listSong.get(id - 1);
    }

    @Override
    public void edit(int id, Song song) {
        listSong.get(id -1).setName(song.getName());

    }

    @Override
    public void sort() {
        Collections.sort(listSong);
        upDateId();

    }
}
