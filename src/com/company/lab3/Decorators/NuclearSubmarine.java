package com.company.lab3.Decorators;

import com.company.lab3.Boat;

public class NuclearSubmarine extends Decorator {
    private Boat boat;

    public NuclearSubmarine(Boat boat) {
        this.boat = boat;
    }

    public String getDescription() {
        return "This is NuclearSubmarine. Weight is " + this.boat.getWeight() + 1000 + "kg. Speed is " + (this.boat.getSpeed() - 20) +
                "km/h. Color is black.";
    }
}
