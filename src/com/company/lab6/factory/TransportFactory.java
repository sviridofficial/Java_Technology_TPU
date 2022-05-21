package com.company.lab6.factory;

import com.company.lab6.AirTransport.Airplane;
import com.company.lab6.AirTransport.Helicopter;
import com.company.lab6.WaterTransport.Boat;
import com.company.lab6.WaterTransport.Yacht;

public interface TransportFactory {
    Airplane createAirplane();

    Helicopter createHelicopter();

    Boat createBoat();

    Yacht createYacht();
}
