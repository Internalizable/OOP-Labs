package me.internalizable.labs.runtime;

import lombok.Getter;

@Getter
public class Chronometer {

    private int hours;
    private int minutes;
    private int seconds;

    public Chronometer() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public void start() {
        System.out.println("Chronometer Started");
    }

    public String getTime() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public void stop() {
        System.out.println("Chronometer Stopped");
        System.out.println(getTime());

        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public void increment() {
        seconds++;

        if(seconds == 60) {
            seconds = 0;
            minutes++;
        }

        if(minutes == 60) {
            minutes = 0;
            hours++;
        }
    }

}
