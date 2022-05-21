package com.company.lab5.factory;


import com.company.lab5.AirTransport.*;
import com.company.lab5.AirTransport.Airplane;
import com.company.lab5.AirTransport.Helicopter;
import com.company.lab5.TransportNames;

import java.util.ArrayList;
import java.util.Random;

public class AirTransportFactory {
    public AirTransport createAirTransport(TransportNames transportName) {
        Random random = new Random();
        if (transportName == null) {
            return null;
        } else if (transportName == TransportNames.AIRPLANE) {
            return new Airplane(random.nextInt(1000000), random.nextInt(100), random.nextInt(100),
                    random.nextInt(10000), random.nextInt(20000), getRandomColor(), getRandomModelName());

        } else if (transportName == TransportNames.HELICOPTER) {
            return new Helicopter(random.nextInt(1000000), random.nextInt(30), random.nextInt(500),
                    random.nextInt(10000), random.nextInt(5000), getRandomColor(), random.nextInt(5));
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

    static String getRandomModelName() {
        ArrayList<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Airbus");
        listOfNames.add("Boeing");
        listOfNames.add("British Aerospace");
        return listOfNames.get(new Random().nextInt(3));
    }
}
