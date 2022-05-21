package com.company.lab6.MilitaryTransport;

import com.company.lab6.AirTransport.Helicopter;

public class MilitaryHelicopter extends Helicopter {
    public MilitaryHelicopter(int weight, int peopleCapacity, int speed, int maxFlightAltitude, int maxFlightDistance, String color, int numberOfBlades) {
        super(weight, peopleCapacity, speed, maxFlightAltitude, maxFlightDistance, color, numberOfBlades);
    }

    @Override
    public String getDescription() {
        return "This is Military Helicopter. My color is " + this.getColor() + ". Number of blades is " + getNumberOfBlades();
    }
}
