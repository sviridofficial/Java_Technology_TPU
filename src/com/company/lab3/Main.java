package com.company.lab3;

import com.company.lab3.Decorators.CargoAirplane;
import com.company.lab3.Decorators.Decorator;
import com.company.lab3.Decorators.HypersonicAircraft;
import com.company.lab3.Decorators.NuclearSubmarine;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите какое количество обьектов сгенерировать: ");
        int numberOfObjects = scanner.nextInt();
        ArrayList<Decorator> transportArrayList = new ArrayList<Decorator>();

        for (int i = 0; i < numberOfObjects; i++) {
            if (random.nextInt(2) == 0) {
                Airplane airplane = new Airplane(random.nextInt(1000000), random.nextInt(100), random.nextInt(100),
                        random.nextInt(10000), random.nextInt(20000), getRandomColor(), getRandomModelName());
                transportArrayList.add(i % 2 == 0 ? new HypersonicAircraft(airplane) : new CargoAirplane(airplane));
            } else {
                Boat boat = new Boat(random.nextInt(1000000), random.nextInt(100), random.nextInt(100), getRandomColor(),
                        getRandomTypeWaterTransport(), random.nextInt(30000), random.nextInt(10000)
                );
                transportArrayList.add(new NuclearSubmarine(boat));

            }
        }

        for (int i = 0; i < transportArrayList.size(); i++) {

            System.out.println(transportArrayList.get(i).getDescription());
        }

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
