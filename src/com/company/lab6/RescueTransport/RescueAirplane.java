package com.company.lab6.RescueTransport;

import com.company.lab6.AirTransport.Airplane;

public class RescueAirplane extends Airplane {
    public RescueAirplane(int weight, int peopleCapacity, int speed, int maxFlightAltitude, int maxFlightDistance, String color, String modelName) {
        super(weight, peopleCapacity, speed, maxFlightAltitude, maxFlightDistance, color, modelName);
    }

    @Override
    public String getDescription() {
        return "This is Rescue Airplane. My model is " + getModelName() + ". My color is " + getColor();
    }
}
