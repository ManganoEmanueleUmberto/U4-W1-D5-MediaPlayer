package entities;

public class Video extends Multimedia {


    public Video(String title, int duration, int brightness, int volume) {
        super(title, duration, brightness, volume);
    }

    @Override
    public void play() {
        String stringVolume = "";
        String stringBrightness = "";

        for (int i = 0; i < volume; i++) {
            stringVolume = stringVolume + "!";
        }
        for (int i = 0; i < brightness; i++) {
            stringBrightness = stringBrightness + "*";
        }

        System.out.println(title + stringVolume + stringBrightness);

    }

    @Override
    public void show() {
        System.out.println("It's NOT an image. USE .play instead");
    }


}
