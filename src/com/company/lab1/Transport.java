package com.company.lab1;

abstract class Transport {
    private int weight;
    private int peopleCapacity;
    private int speed;
    private String color;

    String getDescription() {
        return "This is transport class.";
    }

    public Transport(int weight, int peopleCapacity, int speed, String color) {
        this.weight = weight;
        this.peopleCapacity = peopleCapacity;
        this.speed = speed;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }
}
