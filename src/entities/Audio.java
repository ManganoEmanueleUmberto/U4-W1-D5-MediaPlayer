package entities;

import interfaces.Playable;

public class Audio extends Multimedia implements Playable {
    public Audio(String title, int duration, int volume) {
        super(title, duration, volume);
    }

    public void play() {
        String stringVolume = "";
        for (int i = 0; i < volume; i++) {
            stringVolume = stringVolume + "!";
        }

        for (int i = 0; i < duration; i++) {
            System.out.println(title + stringVolume);

        }
    }

    public int turnUpVolume() {
        return volume++;
    }

    public int turnDownVolume() {
        return volume--;
    }
}
