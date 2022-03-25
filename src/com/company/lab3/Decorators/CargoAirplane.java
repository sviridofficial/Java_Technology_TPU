package com.company.lab3.Decorators;

import com.company.lab3.Airplane;

public class CargoAirplane extends Decorator{
    private Airplane airplane;

    public CargoAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String getDescription() {
        return "This is CargoAirplane. My speed is " + this.airplane.getSpeed() + ". My goal is to destroy. MaxFlightAltitude is " + this.airplane.getMaxFlightAltitude() * 5;
    }
}
