import entities.Audio;
import entities.Image;
import entities.Multimedia;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Audio audio1 = new Audio("Audio 1", 5, 30);
        Video video1 = new Video("Video 1", 1, 2, 5);
        Audio audio2 = new Audio("Audio 2", 5, 30);
        Video video2 = new Video("Video 2", 1, 2, 5);
        Image image1 = new Image("Image1", 10);

        Multimedia[] arrayMultimedia = {audio1, video1, audio2, video2, image1};

        while (!exit) {


            System.out.println("       -----MENÚ----- \n\nPick the media you wish to play: ");
            for (int i = 0; i < arrayMultimedia.length; i++) {
                System.out.println(" " + (i + 1) + " " + arrayMultimedia[i].getTitle());
            }
            System.out.println(" \n 0 Exit");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) exit = true;
            else if (arrayMultimedia[choice - 1] instanceof Audio || arrayMultimedia[choice - 1] instanceof Video)
                arrayMultimedia[choice - 1].play();
            else arrayMultimedia[choice - 1].show();

        }
    }
}
