package com.company.lab6.MilitaryTransport;

import com.company.lab6.WaterTransport.Boat;

public class MilitaryBoat extends Boat {
    public MilitaryBoat(int weight, int peopleCapacity, int speed, String color, String typeWaterTransport, int loadCapacity, int maxImmersionDepth) {
        super(weight, peopleCapacity, speed, color, typeWaterTransport, loadCapacity, maxImmersionDepth);
    }

    @Override
    public String getDescription() {
        return "This is Military Boat. Immersion Depth is " + getMaxImmersionDepth() + "m. Weight is " + this.getWeight() + "kg. Speed is " + this.getWeight() +
                "km/h. Color is " + this.getColor() + ". Type is " + this.getTypeWaterTransport() + ".";
    }
}
