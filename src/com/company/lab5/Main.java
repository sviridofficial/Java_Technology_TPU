package com.company.lab5;

import com.company.lab5.AirTransport.AirTransport;
import com.company.lab5.WaterTransport.WaterTransport;
import com.company.lab5.factory.AirTransportFactory;
import com.company.lab5.factory.WaterTransportFactory;

public class Main {

    public static void main(String[] args) {
        //Первая Фабрика
        AirTransportFactory airTransportFactory = new AirTransportFactory();
        AirTransport airplane = airTransportFactory.createAirTransport(TransportNames.AIRPLANE);
        AirTransport vehicle = airTransportFactory.createAirTransport(TransportNames.HELICOPTER);
        System.out.println(airplane.getDescription());
        System.out.println(vehicle.getDescription());

        //Вторая Фабрика
        WaterTransportFactory waterTransportFactory = new WaterTransportFactory();
        WaterTransport boat = waterTransportFactory.createWaterTransport(TransportNames.BOAT);
        WaterTransport yacht = waterTransportFactory.createWaterTransport(TransportNames.YACHT);
        System.out.println(boat.getDescription());
        System.out.println(yacht.getDescription());
    }

}
