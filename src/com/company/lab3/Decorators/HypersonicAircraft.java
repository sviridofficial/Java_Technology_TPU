package com.company.lab3.Decorators;

import com.company.lab3.Airplane;


public class HypersonicAircraft extends Decorator {
    private Airplane airplane;

    public HypersonicAircraft(Airplane airplane) {
        this.airplane = airplane;
    }

    public String getDescription() {
        return "This is HypersonicAircraft. My speed is " + this.airplane.getSpeed() * 10 + ". My goal is to destroy";
    }

}
