package entities;

public abstract class Multimedia {
    String title;
    int duration;
    int volume;
    int brightness;

    public Multimedia(String title, int duration, int volume) {
        this.title = title;
        this.duration = duration;
        this.volume = volume;
    }

    public Multimedia(String title, int duration, int brightness, int volume) {

        this.title = title;
        this.duration = duration;
        this.brightness = brightness;
        this.volume = volume;
    }

    public Multimedia(String title, int brightness) {
        this.title = title;
        this.brightness = brightness;
    }

    public abstract void play();

    public abstract void show();

    public int turnUpVolume() {
        return volume++;
    }

    public int turnDownVolume() {
        return volume--;
    }

    public int increaseBrightness() {
        return brightness++;
    }

    public int decreaseBrightness() {
        return brightness--;
    }

}
