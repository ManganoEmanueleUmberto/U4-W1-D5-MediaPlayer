package entities;

public class Image extends Multimedia {
    public Image(String title, int brightness) {
        super(title, brightness);
    }

    @Override
    public void play() {
        System.out.println("It's NOT an Audio/Video. USE .show instead");
    }

    @Override
    public void show() {
        String stringBrightness = "";
        for (int i = 0; i < brightness; i++) {
            stringBrightness = stringBrightness + "*";
        }
        System.out.println(title + stringBrightness);

    }
}
