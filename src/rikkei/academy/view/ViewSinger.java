package rikkei.academy.view;

import rikkei.academy.controller.SingerController;
import rikkei.academy.model.Singer;

import java.util.Scanner;

public class ViewSinger {
    static Scanner scanner = new Scanner(System.in);
    private SingerController singerController = new SingerController();

    public void showListSingerView() {
        for (Singer singer :
                singerController.showListSinger()) {
            System.out.println(singer.getId() + "." + singer.getName() + "." + singer.getAge() + singer.getSongs()) ;
        }
    }

    public void createSinger() {
        System.out.println("Enter singer name");
        String name = scanner.nextLine();
        System.out.println("Enter singer age");
        int age = Integer.parseInt(scanner.nextLine());
        singerController.addSinger(new Singer(singerController.showListSinger().size() + 1, name, age));


    }

    public void deleteSinger() {
        System.out.println("Enter id Singer want to delete");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isValidate(id)) {
            return;
        }
        System.out.println("Do You sure want to delete: Yes/No");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Yes")) {
            singerController.deleteSinger(id);
        } else if (input.equalsIgnoreCase("No")) {
            System.out.println("Yes Please");
        }else {
            System.out.println("Is Wrong");
        }


    }

    public void findById() {
        System.out.println("Singer id want to show");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isValidate(id)) {
            return;
        }
        Singer singer = singerController.detailSinger(id);
        System.out.println("ID:" + singer.getId() + " ,name: " + singer.getName() + ", age: " + singer.getAge());


    }

    public void updateSinger() {
        System.out.println("EDIT SINGER");
        System.out.println("Enter id singer to edit");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name singer to edit");
        String name = scanner.nextLine();
        System.out.println("Enter age singer to edit");
        int age = Integer.parseInt(scanner.nextLine());
        singerController.editSinger(id, new Singer(id, name, age));


    }

    public boolean isValidate(int id) {
        int size = singerController.showListSinger().size();
        if (id >= 0 && id <= size) {
            return true;
        }
        return false;

    }

    public void sortSinger() {
        System.out.println("Sorted");
        singerController.sortSinger();
        showListSingerView();

    }

    public ViewSinger() {

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
                this.showListSingerView();
                break;
            case 2:
                this.createSinger();
                break;
            case 3:
                this.deleteSinger();
                break;
            case 4:
                this.updateSinger();
                break;
            case 5:
                this.findById();
                break;
            case 6:
                this.sortSinger();
                break;
            case 7:
                System.exit(7);
                break;
            default:
                System.out.println("Invalid found");

        }
    }
}
