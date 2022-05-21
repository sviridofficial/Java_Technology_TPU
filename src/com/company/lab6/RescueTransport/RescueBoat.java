package com.company.lab6.RescueTransport;

import com.company.lab6.WaterTransport.Boat;

public class RescueBoat extends Boat {
    public RescueBoat(int weight, int peopleCapacity, int speed, String color, String typeWaterTransport, int loadCapacity, int maxImmersionDepth) {
        super(weight, peopleCapacity, speed, color, typeWaterTransport, loadCapacity, maxImmersionDepth);
    }

    @Override
    public String getDescription() {
        return "This is Rescue Boat. Immersion Depth is " + getMaxImmersionDepth() + "m. Weight is " + this.getWeight() + "kg. Speed is " + this.getWeight() +
                "km/h. Color is " + this.getColor() + ". Type is " + this.getTypeWaterTransport() + ".";
    }
}
