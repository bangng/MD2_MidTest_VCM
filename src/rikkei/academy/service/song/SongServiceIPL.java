package rikkei.academy.service.song;

import rikkei.academy.model.Singer;
import rikkei.academy.model.Song;
import rikkei.academy.service.Singer.SingerServiceIPL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SongServiceIPL implements ISongService {
    Scanner scanner = new Scanner(System.in);
   static List<Singer> singersList = new ArrayList<>();
    static {
        singersList.add(SingerServiceIPL.listSinger.get(0));
        singersList.add(SingerServiceIPL.listSinger.get(1));
        singersList.add(SingerServiceIPL.listSinger.get(2));
        singersList.add(SingerServiceIPL.listSinger.get(3));
        singersList.add(SingerServiceIPL.listSinger.get(4));

    }


    static List<Song> listSong = new ArrayList<>();
    static {
        Song song1 = new Song (1,"one");
        song1.getSingers().add(singersList.get(1));
        singersList.get(1).getSongs().add(song1);
        listSong.add(song1);
        Song song2 = new Song (2,"two");
        song2.getSingers().add(singersList.get(3));
        singersList.get(3).getSongs().add(song2);
        listSong.add(song2);
        Song song3 = new Song (3,"three");
        song3.getSingers().add(singersList.get(4));
        singersList.get(4).getSongs().add(song3);
        listSong.add(song3);
//        Song song4 = new Song (4,"four");
//        song4.getSingers().add(singersList.get(5));
//        singersList.get(5).getSongs().add(song4);
//        listSong.add(song4);



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
        for (int i = 0; i < listSong.size(); i++) {
            if (id == listSong.get(i).getId()){
                return listSong.get(i);
            }

        }
        return null;
    }

    @Override
    public void edit(int id, Song song) {
        listSong.get(id).setName(song.getName());


    }

    @Override
    public void sort() {
        Collections.sort(listSong);
        upDateId();

    }
}
