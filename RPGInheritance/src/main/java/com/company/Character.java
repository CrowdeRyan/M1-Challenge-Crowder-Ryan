package com.company;

public class Character {
    private String name;
    private int health;
    private int stamina;
    private int speed;
    private int strength;
    private int attackPower;

    public Character(String name, int health, int stamina, int speed, int strength, int attackPower){
        super();
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.strength = strength;
        this.attackPower = attackPower;
    }

    public Character(){
        this("Protagonist",0,0,0,0,0);
    }

    public void run() {
        System.out.println(name + " bravely runs away.");
    }

    public void attack(){
        System.out.println(name + " strikes hard, strikes fast... with no mercy");
    }

    public void heal(){
        System.out.println(name + " drinks a potion.");
    }

    public void decreaseHealth() {
        System.out.println(name + " has an owie.");
    }

    public void increaseStamina() {
        System.out.println(name = " is roiding out!");
    }

    public void decreaseStamina(){
        System.out.println(name + " is tuckered out.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
