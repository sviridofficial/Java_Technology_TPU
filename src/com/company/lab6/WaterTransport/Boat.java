package com.company.lab6.WaterTransport;


public class Boat extends WaterTransport {
    private int maxImmersionDepth;

    @Override
    public String getDescription() {
        return "This is Boat. Immersion Depth is " + this.maxImmersionDepth + "m. Weight is " + this.getWeight() + "kg. Speed is " + this.getWeight() +
                "km/h. Color is " + this.getColor() + ". Type is " + this.getTypeWaterTransport() + ".";
    }

    public int getMaxImmersionDepth() {
        return maxImmersionDepth;
    }

    public void setMaxImmersionDepth(int maxImmersionDepth) {
        this.maxImmersionDepth = maxImmersionDepth;
    }

    public Boat(int weight, int peopleCapacity, int speed, String color, String typeWaterTransport, int loadCapacity, int maxImmersionDepth) {
        super(weight, peopleCapacity, speed, color, typeWaterTransport, loadCapacity);
        this.maxImmersionDepth = maxImmersionDepth;
    }
}
