package com.company;

public class Farmer extends Character{

    public Farmer (String name) {
        super(name, 100, 75, 10,75, 1);
    }

    public void plow() {
        System.out.println(getName() + " plows their field.");
    }

    public void harvest(){
        System.out.println(getName() + " reaps what they have sowed.");
    }
}
