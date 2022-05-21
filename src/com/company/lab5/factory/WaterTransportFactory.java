package com.company.lab5.factory;

import com.company.lab5.WaterTransport.Boat;
import com.company.lab5.TransportNames;
import com.company.lab5.WaterTransport.*;

import java.util.ArrayList;
import java.util.Random;

public class WaterTransportFactory {
    public WaterTransport createWaterTransport(TransportNames transportName) {
        Random random = new Random();
        if (transportName == null) {
            return null;
        } else if (transportName == TransportNames.BOAT) {
            return new Boat(random.nextInt(1000000), random.nextInt(100), random.nextInt(100), getRandomColor(),
                    getRandomTypeWaterTransport(), random.nextInt(30000), random.nextInt(10000)
            );
        } else if (transportName == TransportNames.YACHT) {
            return new Yacht(random.nextInt(1000000), random.nextInt(100), random.nextInt(100), getRandomColor(),
                    "Passenger", random.nextInt(30000), random.nextInt(3));
        }
        return null;
    }

    static String getRandomColor() {
        ArrayList<String> listOfColors = new ArrayList<String>();
        listOfColors.add("red");
        listOfColors.add("green");
        listOfColors.add("blue");
        return listOfColors.get(new Random().nextInt(3));
    }

    static String getRandomTypeWaterTransport() {
        ArrayList<String> listOfTypes = new ArrayList<String>();
        listOfTypes.add("Industrial");
        listOfTypes.add("Passenger");
        return listOfTypes.get(new Random().nextInt(2));
    }
}
