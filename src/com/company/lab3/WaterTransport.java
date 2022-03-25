package com.company.lab3;

abstract class WaterTransport extends Transport {
    private String typeWaterTransport;
    private int loadCapacity;

    public WaterTransport() {
        super();

    }

    @Override
    String getDescription() {
        return "This is Water Transport class.";
    }

    public WaterTransport(int weight, int peopleCapacity, int speed, String color, String typeWaterTransport, int loadCapacity) {
        super(weight, peopleCapacity, speed, color);
        this.typeWaterTransport = typeWaterTransport;
        this.loadCapacity = loadCapacity;
    }

    public String getTypeWaterTransport() {
        return typeWaterTransport;
    }

    public void setTypeWaterTransport(String typeWaterTransport) {
        this.typeWaterTransport = typeWaterTransport;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
