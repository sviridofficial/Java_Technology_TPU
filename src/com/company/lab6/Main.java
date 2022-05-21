package com.company.lab6;

import com.company.lab6.AirTransport.Airplane;
import com.company.lab6.AirTransport.Helicopter;
import com.company.lab6.WaterTransport.Boat;
import com.company.lab6.WaterTransport.Yacht;
import com.company.lab6.factory.MilitaryTransportFactory;
import com.company.lab6.factory.RescueTransportFactory;
import com.company.lab6.factory.TransportFactory;

public class Main {

    public static void main(String[] args) {
        //Military
        TransportFactory transportFactory = getTransportFactory(TransportTypes.MILITARY);
        Airplane airplane = transportFactory.createAirplane();
        Helicopter helicopter = transportFactory.createHelicopter();
        Boat boat = transportFactory.createBoat();
        Yacht yacht = transportFactory.createYacht();
        System.out.println(airplane.getDescription());
        System.out.println(helicopter.getDescription());
        System.out.println(boat.getDescription());
        System.out.println(yacht.getDescription());


        //Rescue
        transportFactory = getTransportFactory(TransportTypes.RESCUE);
        airplane = transportFactory.createAirplane();
        helicopter = transportFactory.createHelicopter();
        boat = transportFactory.createBoat();
        yacht = transportFactory.createYacht();
        System.out.println(airplane.getDescription());
        System.out.println(helicopter.getDescription());
        System.out.println(boat.getDescription());
        System.out.println(yacht.getDescription());
    }

    public static TransportFactory getTransportFactory(TransportTypes transportType) {
        if (transportType == TransportTypes.MILITARY) {
            return new MilitaryTransportFactory();
        } else if (transportType == TransportTypes.RESCUE) {
            return new RescueTransportFactory();
        }
        return null;
    }
}
