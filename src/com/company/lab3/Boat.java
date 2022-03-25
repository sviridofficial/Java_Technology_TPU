package com.company.lab3;

public class Boat extends WaterTransport {
    private int maxImmersionDepth;

    public Boat() {
        super();
    }

    @Override
    String getDescription() {
        return "This is Boat. Immersion Depth is " + this.maxImmersionDepth + "m. Weight is " + this.getWeight() + "kg. Speed is " + this.getWeight() +
                "km/h. Color is " + this.getColor() + ". Type is " + this.getTypeWaterTransport() + ".";
    }

    public Boat(int weight, int peopleCapacity, int speed, String color, String typeWaterTransport, int loadCapacity, int maxImmersionDepth) {
        super(weight, peopleCapacity, speed, color, typeWaterTransport, loadCapacity);
        this.maxImmersionDepth = maxImmersionDepth;
    }
}
