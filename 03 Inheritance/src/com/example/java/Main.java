package com.example.java;

import sino.game.StaticObject;
import sino.unit.Object;
import sino.unit.location.Distance;
import sino.unit.location.Location;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Object> gameObjects = new LinkedList<Object>();

        StaticObject myStatic = new StaticObject(new Location(Distance.fromMeters(10),
                Distance.fromMeters(5)),
                "imageSources/image_tree.png", "Tree");

        gameObjects.add(myStatic);
    }
}
