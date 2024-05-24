import entities.Audio;
import entities.Multimedia;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Audio audio1 = new Audio("RESPIRO", 5, 30);
        Video video1 = new Video("Ciao", 1, 2, 5);
        Multimedia[] arrayMultimedia = {audio1, video1};
        for (int i = 0; i < arrayMultimedia.length; i++) {
            if (arrayMultimedia[i] instanceof Audio || arrayMultimedia[i] instanceof Video) {
                arrayMultimedia[i].play();

            } else {
                arrayMultimedia[i].show();
            }

        }
    }
}
