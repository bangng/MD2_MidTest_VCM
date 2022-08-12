package rikkei.academy.model;

public class Song implements Comparable<Song>{
    private int id;
    private String name;
    private int listen;
    private int like;

    public Song() {

    }

    public Song(int id, String name) {
        this.id = id;
        this.name = name;

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
                ", name='" + name + '\'' +
                ", listen=" + listen +
                ", like=" + like +
                '}';
    }

    @Override
    public int compareTo(Song song) {
        return this.name.compareTo(song.name);

    }
}
