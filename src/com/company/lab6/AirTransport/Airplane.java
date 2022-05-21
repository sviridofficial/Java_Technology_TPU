package com.company.lab6.AirTransport;


public class Airplane extends AirTransport {
    private String modelName;

    @Override
    public String getDescription() {
        return "This is Airplane. My model is " + this.modelName + ". My color is " + this.getColor();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Airplane(int weight, int peopleCapacity, int speed, int maxFlightAltitude, int maxFlightDistance, String color, String modelName) {
        super(weight, peopleCapacity, speed, maxFlightAltitude, maxFlightDistance, color);
        this.modelName = modelName;
    }
}
