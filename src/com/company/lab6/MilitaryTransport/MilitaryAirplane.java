package com.company.lab6.MilitaryTransport;

import com.company.lab6.AirTransport.Airplane;

public class MilitaryAirplane extends Airplane {
    public MilitaryAirplane(int weight, int peopleCapacity, int speed, int maxFlightAltitude, int maxFlightDistance, String color, String modelName) {
        super(weight, peopleCapacity, speed, maxFlightAltitude, maxFlightDistance, color, modelName);
    }

    @Override
    public String getDescription() {
        return "This is Military Airplane. My model is " + getModelName() + ". My color is " + getColor();
    }
}
