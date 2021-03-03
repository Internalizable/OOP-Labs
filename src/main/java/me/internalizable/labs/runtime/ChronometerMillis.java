package me.internalizable.labs.runtime;

import lombok.Getter;

import java.util.concurrent.TimeUnit;

@Getter
public class ChronometerMillis {

    private long startMillis;

    public void start() {
        System.out.println("Chronometer Started");
        this.startMillis = System.currentTimeMillis();
    }

    public String getTime() {
        long elapsedMillis = System.currentTimeMillis() - startMillis;

        int hours = Math.toIntExact(TimeUnit.MILLISECONDS.toHours(elapsedMillis));
        int minutes = Math.toIntExact(TimeUnit.MILLISECONDS.toMinutes(elapsedMillis) % 60);
        int seconds = Math.toIntExact(TimeUnit.MILLISECONDS.toSeconds(elapsedMillis) % 60);

        return hours + ":" + minutes + ":" + seconds;
    }

    public void stop() {
        System.out.println("Chronometer Stopped");
        System.out.println(getTime());

        this.startMillis = 0;
    }

}
