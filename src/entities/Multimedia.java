package entities;

import interfaces.BrightnessRegulator;
import interfaces.Playable;

public abstract class Multimedia implements Playable, BrightnessRegulator {
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

    public int turnUpVolume(int value) {
        return volume + value;
    }

    public int turnDownVolume(int value) {
        return volume - value;
    }

    public int increaseBrightness(int value) {
        return brightness + value;
    }

    public int decreaseBrightness(int value) {
        return brightness - value;
    }

    public String getTitle() {
        return title;
    }
}
