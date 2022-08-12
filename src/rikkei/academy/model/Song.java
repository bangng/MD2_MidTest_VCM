package rikkei.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Song implements Comparable<Song>{
    private int id;
    private String name;
    private int listen;
    private int like;
    private List<Singer> singers = new ArrayList<>();

    public Song() {

    }

    public Song(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
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

    public int getListen() {
        return listen;
    }

    public void setListen(int listen) {
        this.listen = listen;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' + singers +
                ", listen=" + listen +
                ", like=" + like +
                '}';
    }

    @Override
    public int compareTo(Song song) {
        return this.name.compareTo(song.name);

    }
}
