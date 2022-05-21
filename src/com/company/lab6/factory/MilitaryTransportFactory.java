package com.company.lab6.factory;

import com.company.lab6.AirTransport.Airplane;
import com.company.lab6.AirTransport.Helicopter;
import com.company.lab6.MilitaryTransport.MilitaryAirplane;
import com.company.lab6.MilitaryTransport.MilitaryBoat;
import com.company.lab6.MilitaryTransport.MilitaryHelicopter;
import com.company.lab6.MilitaryTransport.MilitaryYacht;
import com.company.lab6.WaterTransport.Boat;
import com.company.lab6.WaterTransport.Yacht;

import java.util.ArrayList;
import java.util.Random;

public class MilitaryTransportFactory implements TransportFactory {
    Random random = new Random();

    @Override
    public Airplane createAirplane() {
        return new MilitaryAirplane(random.nextInt(1000000), random.nextInt(100), random.nextInt(100),
                random.nextInt(10000), random.nextInt(20000), getRandomColor(), getRandomModelName());
    }

    @Override
    public Helicopter createHelicopter() {
        return new MilitaryHelicopter(random.nextInt(1000000), random.nextInt(30), random.nextInt(500),
                random.nextInt(10000), random.nextInt(5000), getRandomColor(), random.nextInt(5));
    }

    @Override
    public Boat createBoat() {
        return new MilitaryBoat(random.nextInt(1000000), random.nextInt(100), random.nextInt(100), getRandomColor(),
                getRandomTypeWaterTransport(), random.nextInt(30000), random.nextInt(10000)
        );
    }

    @Override
    public Yacht createYacht() {
        return new MilitaryYacht(random.nextInt(1000000), random.nextInt(100), random.nextInt(100), getRandomColor(),
                "Passenger", random.nextInt(30000), random.nextInt(3));
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

    static String getRandomTypeWaterTransport() {
        ArrayList<String> listOfTypes = new ArrayList<String>();
        listOfTypes.add("Industrial");
        listOfTypes.add("Passenger");
        return listOfTypes.get(new Random().nextInt(2));
    }
}
