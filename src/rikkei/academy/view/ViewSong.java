package rikkei.academy.view;

import rikkei.academy.controller.SingerController;
import rikkei.academy.controller.SongController;
import rikkei.academy.model.Singer;
import rikkei.academy.model.Song;

import java.util.Scanner;

public class ViewSong {
    static Scanner scanner = new Scanner(System.in);
    private SongController songController = new SongController();

    public void showListSongView() {
        for (Song song :
                songController.songList()) {
            System.out.println(song.getId() + ". " + song.getName());
        }
    }

    public void createSong() {
        SingerController singerController = new SingerController();
        System.out.println("Enter new Song");
        String name = scanner.nextLine();

        System.out.println("Enter id Singer");
        int idSinger = Integer.parseInt(scanner.nextLine());
        for (Singer singer :
                singerController.showListSinger()) {
            songController.addSong(new Song(songController.songList().size() + 1, name));
        }

    }

    public void deleteSong() {
        System.out.println("Enter id Song want to delete");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isValidate(id)) {
            return;
        }
        System.out.println("Do You sure want to delete: Yes/No");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Yes")) {
            songController.deleteSong(id);
        } else if (input.equalsIgnoreCase("No")) {
            System.out.println("Yes Please");
        } else {
            System.out.println("Is Wrong");
        }
    }

    public boolean isValidate(int id) {
        int size = songController.songList().size();
        if (id >= 0 && id <= size) {
            return true;
        }
        return false;

    }

    public void updateSong() {
        System.out.println("EDIT SONG");
        System.out.println("Enter id song to edit");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name song to edit");
        String name = scanner.nextLine();

        songController.editSong(id, new Song(id, name));


    }

    public void findByIdSong() {
        System.out.println("Song id want to show");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isValidate(id)) {
            return;
        }
        Song song = songController.detailSong(id);
        System.out.println("ID:" + song.getId() + " ,name: " + song.getName());


    }

    public void sortSong() {
        System.out.println("Sorted");
        songController.sortSong();
        showListSongView();

    }

    ViewSong() {
        System.out.println("Menu");
        System.out.println("1: Show list Song");
        System.out.println("2: Add Song");
        System.out.println("3: delete Song");
        System.out.println("4: edit Song");
        System.out.println("5: detail Song");
        System.out.println("6: sort Song");
        System.out.println("7: Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                this.showListSongView();
                break;
            case 2:
                this.createSong();
                break;
            case 3:
                this.deleteSong();
                break;
            case 4:
                this.updateSong();
                break;
            case 5:
                this.findByIdSong();
                break;
            case 6:
                this.sortSong();
                break;
            case 7:
                System.exit(7);
                break;
            default:
                System.out.println("Invalid found");

        }
    }

}
