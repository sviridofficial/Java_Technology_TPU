package com.company.lab6.AirTransport;

public class Helicopter extends AirTransport {
    private int numberOfBlades;

    public Helicopter(int weight, int peopleCapacity, int speed, int maxFlightAltitude, int maxFlightDistance, String color, int numberOfBlades) {
        super(weight, peopleCapacity, speed, maxFlightAltitude, maxFlightDistance, color);
        this.numberOfBlades = numberOfBlades;
    }

    @Override
    public String getDescription() {
        return "This is Helicopter. My color is " + this.getColor() + ". Number of blades is " + this.numberOfBlades;
    }

    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }
}
