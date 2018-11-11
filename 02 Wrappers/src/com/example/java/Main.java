package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //showPassed(30,10);

        showPassedPath(Speed.fromKilometersPerHours(50), Time.fromSeconds(25));
    }

    /*
    public static void showPassed(double speed, double time){
        double passed = speed * time;
        System.out.println("Passed = " + passed);
    }
    */

    public static void showPassedPath(Speed speed, Time time) {
        Path path = Path.fromMeters(speed.toMetersPerSecond() * time.toSeconds());

        System.out.println("Passed path is :" + path.toMeters());
    }
}
