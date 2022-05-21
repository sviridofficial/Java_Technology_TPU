package com.company.lab6.MilitaryTransport;

import com.company.lab6.WaterTransport.Yacht;

public class MilitaryYacht extends Yacht {
    public MilitaryYacht(int weight, int peopleCapacity, int speed, String color, String typeWaterTransport, int loadCapacity, int numberOfHelipads) {
        super(weight, peopleCapacity, speed, color, typeWaterTransport, loadCapacity, numberOfHelipads);
    }

    @Override
    public String getDescription() {
        return "This is Military Yacht. Weight is " + this.getWeight() + "kg. Speed is " + this.getWeight() +
                "km/h. Color is " + this.getColor() + ". Number of helipads is " + getNumberOfHelipads();
    }
}
