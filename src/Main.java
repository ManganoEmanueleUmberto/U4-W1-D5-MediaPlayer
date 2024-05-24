import entities.Audio;
import entities.Image;
import entities.Multimedia;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        int choice = 0, choiceAdd = 0, duration = 0, volume = 0, brightness = 0;
        String title = "";1
        Multimedia[] arrayMultimedia = new Multimedia[5];

        while (!exit) {

            System.out.println("       -----MENÚ----- \n\n Insert a number between 1-4 || 0 to exit\n 1. Add a new Audio\n 2. Add a new Video\n 3. Add a new Image\n 4. List of all media \n\n 0. Exit");
            choiceAdd = Integer.parseInt(sc.nextLine());

            switch (choiceAdd) {
                case 1:
                    System.out.println("Enter the title: ");
                    title = sc.nextLine();
                    System.out.println("Enter the duration: ");
                    duration = Integer.parseInt(sc.nextLine());
                    System.out.println("Set Volume: ");
                    volume = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < arrayMultimedia.length; i++) {
                        if (arrayMultimedia[i] == null) {
                            arrayMultimedia[i] = new Audio(title, duration, volume);
                            break;
                        }

                    }
                    break;
                case 2:
                    System.out.println("Enter the title: ");
                    title = sc.nextLine();
                    System.out.println("Enter the duration: ");
                    duration = Integer.parseInt(sc.nextLine());
                    System.out.println("Set brightness: ");
                    brightness = Integer.parseInt(sc.nextLine());
                    System.out.println("Set volume: ");
                    volume = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < arrayMultimedia.length; i++) {
                        if (arrayMultimedia[i] == null) {
                            arrayMultimedia[i] = new Video(title, duration, brightness, volume);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the title: ");
                    title = sc.nextLine();
                    System.out.println("Set brightness: ");
                    brightness = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < arrayMultimedia.length; i++) {
                        if (arrayMultimedia[i] == null) {
                            arrayMultimedia[i] = new Image(title, brightness);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("       -----MENÚ----- \n\nPick the media you wish to play: ");
                    for (int i = 0; i < arrayMultimedia.length; i++) {
                        if (arrayMultimedia[i] != null) {
                            System.out.println(" " + (i + 1) + " " + arrayMultimedia[i].getTitle());
                        }
                    }
                    System.out.println(" \n 0 Exit");
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice == 0) exit = true;
                    else if (arrayMultimedia[choice - 1] instanceof Audio || arrayMultimedia[choice - 1] instanceof Video)
                        arrayMultimedia[choice - 1].play();
                    else arrayMultimedia[choice - 1].show();
                    break;
                case 0:
                    exit = true;
            }
        }
    }
}
