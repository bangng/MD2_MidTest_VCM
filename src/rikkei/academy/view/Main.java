package rikkei.academy.view;

import rikkei.academy.controller.SingerController;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
//    private ViewSinger viewSinger = new ViewSinger();
//
//    private ViewSong viewSong = new ViewSong();
public Main(){
    System.out.println("1: Singer Menu");
    System.out.println("2: Song Menu");
    int input = Integer.parseInt(scanner.nextLine());
    switch (input){
        case 1:
            new ViewSinger();
            break;
        case 2:
            new ViewSong();
            break;
        default:
            System.out.println("目がないのかい‼");
    }

}

    public static void main(String[] args) {
    new Main();

    }
}
