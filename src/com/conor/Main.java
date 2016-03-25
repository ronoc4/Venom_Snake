package com.conor;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Create snake objects
        Snake rattleSnake = new Snake("Rattlesnake", 4);
        Snake seaSnake = new Snake("Sea Snake", 9);
        Snake greenMamba = new Snake("Green Mamba", 9);
        Snake cobra = new Snake("Cobra", 5);
        Snake boaContrictor = new Snake("Boa Contrictor", 0);

        //LinkedList of all snake objects
        LinkedList<Snake> snakes = new LinkedList<Snake>();

        snakes.add(rattleSnake);
        snakes.add(seaSnake);
        snakes.add(greenMamba);
        snakes.add(cobra);
        snakes.add(boaContrictor);

        //Create the collections of snake LL
        Collections.sort(snakes);

        System.out.println("All snakes in ascending order by venom:");
        System.out.println(snakes);
    }
}
