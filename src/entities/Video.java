package entities;

import interfaces.BrightnessRegulator;
import interfaces.Playable;

public class Video extends Multimedia implements Playable, BrightnessRegulator {


    public Video(String title, int duration, int brightness, int volume) {
        super(title, duration, brightness, volume);
    }

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
