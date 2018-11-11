package com.example.java;


// Base class, entry ponit for this app
public class Main
{

    // Main method, runtime point
    public static void main(String[] args)
    {
        Robot robo1 = new Robot("Robot 1", "Black");

        robo1.closeLeftHand();
        System.out.println(robo1);

        robo1.takeContant("Laser Gun");
        System.out.println(robo1);

        robo1.openLeftHand();
        System.out.println(robo1);

        robo1.openRightHand();
        System.out.println(robo1);
    }
}
