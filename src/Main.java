import entities.Audio;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Audio audio1 = new Audio("RESPIRO", 5, 30);
        Video video1 = new Video("Ciao", 1, 2, 5);
        audio1.play();
        video1.play();
    }
}
