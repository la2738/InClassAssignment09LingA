package com.example.android.inclassassignment09_linga;

public class Animal {
    private String name;
    private int numberOfLeg;
    private boolean herbivore;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int numberOfLeg, boolean herbivore) {
        this.name = name;
        this.numberOfLeg = numberOfLeg;
        this.herbivore = herbivore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public boolean isHerbivore() {
        return herbivore;
    }

    public void setHerbivore(boolean herbivore) {
        this.herbivore = herbivore;
    }
}
