package com.company.lab6.RescueTransport;

import com.company.lab6.AirTransport.Helicopter;

public class RescueHelicopter extends Helicopter {
    public RescueHelicopter(int weight, int peopleCapacity, int speed, int maxFlightAltitude, int maxFlightDistance, String color, int numberOfBlades) {
        super(weight, peopleCapacity, speed, maxFlightAltitude, maxFlightDistance, color, numberOfBlades);
    }

    @Override
    public String getDescription() {
        return "This is Rescue Helicopter. My color is " + this.getColor() + ". Number of blades is " + getNumberOfBlades();
    }
}
