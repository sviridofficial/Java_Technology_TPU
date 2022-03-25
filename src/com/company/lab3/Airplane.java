package com.company.lab3;


public class Airplane extends AirTransport {
    private String modelName;

    public Airplane() {
        super();
    }

    String getDescription() {
        return "This is Airplane. My model is " + this.modelName + ". My color is " + this.getColor();
    }

    public Airplane(int weight, int peopleCapacity, int speed, int maxFlightAltitude, int maxFlightDistance, String color, String modelName) {
        super(weight, peopleCapacity, speed, maxFlightAltitude, maxFlightDistance, color);
        this.modelName = modelName;
    }
}
