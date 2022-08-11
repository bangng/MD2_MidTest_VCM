package rikkei.academy.view;

import rikkei.academy.controller.SingerController;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    private ViewSinger viewSinger = new ViewSinger();
public Main(){


    System.out.println("Menu");
    System.out.println("1: Show list Singer");
    System.out.println("2: Add Singer");
    System.out.println("3: delete singer");
    System.out.println("4: edit Singer");
    System.out.println("5: detail Singer");
    System.out.println("6: sort Singer");
    System.out.println("7: Exit");
    int choice = Integer.parseInt(scanner.nextLine());
    switch (choice){
        case 1:
            viewSinger.showListSingerView();
            break;
        case 2:
            viewSinger.createSinger();
            break;
        case 3:
            viewSinger.deleteSinger();
            break;
        case 4:
            viewSinger.updateSinger();
            break;
        case 5:
            viewSinger.findById();
            break;
        case 6:
            viewSinger.sortSinger();
            break;
        case 7:
            System.exit(7);
            break;
        default:
            System.out.println("Invalid found");

    }
    new Main();
}

    public static void main(String[] args) {
    new Main();

    }
}
