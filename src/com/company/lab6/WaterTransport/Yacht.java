package com.company.lab6.WaterTransport;

public class Yacht extends WaterTransport {
    private int numberOfHelipads;

    public Yacht(int weight, int peopleCapacity, int speed, String color, String typeWaterTransport, int loadCapacity, int numberOfHelipads) {
        super(weight, peopleCapacity, speed, color, typeWaterTransport, loadCapacity);
        this.numberOfHelipads = numberOfHelipads;
    }

    @Override
    public String getDescription() {
        return "This is Yacht. Weight is " + this.getWeight() + "kg. Speed is " + this.getWeight() +
                "km/h. Color is " + this.getColor() + ". Number of helipads is " + this.numberOfHelipads;
    }

    public int getNumberOfHelipads() {
        return numberOfHelipads;
    }

    public void setNumberOfHelipads(int numberOfHelipads) {
        this.numberOfHelipads = numberOfHelipads;
    }
}
