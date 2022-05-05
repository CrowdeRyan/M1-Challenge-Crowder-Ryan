package com.company;

public class Constable extends Character {

    private String jurisdiction;

    public Constable (String name, String jurisdiction){
        super(name,100,60,20,60,5);
        this.jurisdiction = jurisdiction;
    }

    public void arrest() {
        System.out.println(getName() +" will strap the cuffs on you!");
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
