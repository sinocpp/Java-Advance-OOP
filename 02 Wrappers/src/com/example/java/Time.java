package com.example.java;

public class Time {
    private double seconds;

    private Time(double seconds) {
        this.seconds = seconds;
    }

    // Static methods can be called without creating a object from a class
    public static Time fromSeconds(double seconds) {
        return new Time(seconds);
    }

    public static Time fromMinutes(double minutes) {
        return new Time(minutes * 60.0);
    }

    public static Time fromHours(double hours) {
        return new Time(hours * 3600.0);
    }

    public double getSeconds() {
        return this.seconds;
    }

    public double toMinutes() {
        return this.seconds / 60.0;
    }

    public double toHours() {
        return this.seconds / 3600.0;
    }

    public double toSeconds() {
        return this.seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public void addSeconds(double seconds) {
        this.seconds += seconds;
    }

    public  void  addMinutes(double minutes) {
        this.seconds += minutes * 60;
    }
}
