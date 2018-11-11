package com.example.java;

public class Speed {
    private double mps;

    private Speed(double mps) {
        this.mps = mps;
    }

    public static Speed fromMetersPerSeconds(double mps) {
        return new Speed(mps);
    }

    public static Speed fromKilometersPerHours(double kmps) {
        return new Speed(kmps / 3.6);
    }

    public double toMetersPerSecond() {
        return  this.mps;
    }

    public double toKilometersPerHours() {
        return this.mps * 3.6;
    }

    public void addMetersPerSeconds(double mps) {
        this.mps += mps;
    }

    public void setMps(double mps) {
        this.mps = mps;
    }

    public void addKilometersPerHour(double kmps) {
        this.mps += kmps / 3.6;
    }
}
