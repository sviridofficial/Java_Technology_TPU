package com.company.lab5;

import com.company.lab5.AirTransport.AirTransport;
import com.company.lab5.factory.AirTransportFactory;

public class Main {

    public static void main(String[] args) {
        AirTransportFactory airTransportFactory = new AirTransportFactory();
        AirTransport airplane = airTransportFactory.createAirTransport(TransportNames.AIRPLANE);
        AirTransport vehicle = airTransportFactory.createAirTransport(TransportNames.HELICOPTER);
        System.out.println(airplane.getDescription());
        System.out.println(vehicle.getDescription());
    }

}
