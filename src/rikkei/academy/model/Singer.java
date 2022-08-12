package rikkei.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Singer implements Comparable<Singer>{
    private int id;
    private String name;
    private int age;
    private List<Song> songs = new ArrayList<>();

    public Singer() {

    }

    public Singer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Singer singer) {
        if (!this.name.equals(singer.name)){
            return this.name.compareTo(singer.name);
        }else {
            return this.age - singer.age;
        }

    }
}
