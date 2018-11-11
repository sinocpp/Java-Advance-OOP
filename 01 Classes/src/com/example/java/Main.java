package com.example.java;


// Base class, entry ponit for this app
public class Main
{

    // Main method, runtime point
    public static void main(String[] args)
    {
        Robot robo1 = new Robot("Robot 1", "Black");

        robo1.closeLeftHand();
        robo1.takeContant("Laser Gun");
        robo1.openLeftHand();
    }
}
