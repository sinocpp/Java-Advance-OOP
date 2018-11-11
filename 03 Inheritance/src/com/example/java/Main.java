package com.example.java;

import sino.game.enemies.Wolf;
import sino.unit.StaticObject;
import sino.unit.Object;
import sino.unit.location.Distance;
import sino.unit.location.Location;
import sino.unit.location.Speed;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Object> gameObjects = new LinkedList<Object>();

        StaticObject myStatic = new StaticObject(new Location(Distance.fromMeters(10), Distance.fromMeters(5)), "imageSources/image_tree.png", "Tree");

        gameObjects.add(myStatic);

        Wolf littleWolf = new Wolf(new Location(Distance.fromMeters(4), Distance.fromMeters(3)), "someImage", Speed.fromKilometersPerHours(20));
        littleWolf.setName("William");

        gameObjects.add(littleWolf);

        gameObjects.add(new Wolf(new Location(Distance.fromMeters(14), Distance.fromMeters(33)), "someImage_TWO", Speed.fromKilometersPerHours(20)));
        //littleWolf.setName("Hogar the Great");

        for (Object myObj : gameObjects) {
            System.out.println(myObj.getSprite().toString());
            System.out.println("Object name is :" + myObj.getName());
        }
    }
}
