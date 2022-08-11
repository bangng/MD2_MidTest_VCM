package rikkei.academy.service.Singer;

import rikkei.academy.model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingerServiceIPL implements ISingerService {
    Scanner scanner = new Scanner(System.in);
   static List<Singer> listSinger = new ArrayList<>();
    static {
       listSinger.add(new Singer(1,"David",30));
        listSinger.add(new Singer(2,"Justin",26));
        listSinger.add(new Singer(3,"Jame",28));
        listSinger.add(new Singer(4,"John",34));
        listSinger.add(new Singer(5,"Justin",22));

    }
    @Override
    public List<Singer> findAll() {
        return listSinger;
    }

    @Override
    public void save(Singer singer) {

        listSinger.add(singer);
    }

    @Override
    public void deleteById(int id) {
        listSinger.remove(id -1);
        upDateId();
    }

    @Override
    public Singer findById(int id) {
        return listSinger.get(id - 1);
    }

    @Override
    public void edit(int id, Singer singer) {
        listSinger.get(id -1).setName(singer.getName());
        listSinger.get(id -1).setAge(singer.getAge());
    }

    @Override
    public void sort() {
       Collections.sort(listSinger);
       upDateId();
    }
    public void upDateId(){
        for (int i = 0; i < listSinger.size(); i++){
            listSinger.get(i).setId(i+1);
        }
    }

}
