package entities;

public class Audio extends Multimedia {
    public Audio(String title, int duration, int volume) {
        super(title, duration, volume);
    }

    @Override
    public void play() {
        String stringVolume = "";
        for (int i = 0; i < volume; i++) {
            stringVolume = stringVolume + "!";
        }

        for (int i = 0; i < duration; i++) {
            System.out.println(title + stringVolume);

        }
    }

    @Override
    public void show() {
        System.out.println("It's NOT an image. USE .play instead");
    }

}
