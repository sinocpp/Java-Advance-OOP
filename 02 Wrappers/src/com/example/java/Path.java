package com.example.java;

public class Path {
    private double meters;

    private Path(double meters) {
        this.meters = meters;
    }

    public static Path fromMeters(double meters) {
        return new Path(meters);
    }

    public static Path fromKilometers(double kilometers) {
        return new Path(kilometers * 1000);
    }

    public double toMeters() {
        return this.meters;
    }

    public double toKilometers() {
        return  this.meters / 1000.0f;
    }

    public void addMeters(double meters) {
        this.meters += meters;
    }

    public void setMeters(double meters) {
         this.meters = meters;
    }

    public void addKilometers(double kilometers) {
        this.meters += kilometers * 1000.0;
    }
}
