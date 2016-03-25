package com.conor;

/**
 * Created by conor on 3/24/16.
 */
public class Snake implements Comparable<Snake>{

    private String name;
    private double venomRating;

    //Constructor
    public Snake (String s, double v){
        this.name = s;
        this.venomRating = v;
    }

    //Need the override to format the Collection once it prints out
    @Override
    public String toString() {
        return String.format("Name: %s, Venom ratings: %.2f", name, venomRating);
    }

    @Override
    public int compareTo(Snake o) {
        return 0;
    }
}
