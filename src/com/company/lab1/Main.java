package com.company.lab1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите какое количество обьектов сгенерировать: ");
        int numberOfObjects = scanner.nextInt();
        ArrayList<Transport> transportArrayList = new ArrayList<>();

        for (int i = 0; i < numberOfObjects; i++) {
            if (random.nextInt(2) == 0) {
                transportArrayList.add(new Airplane(random.nextInt(1000000), random.nextInt(100), random.nextInt(100),
                        random.nextInt(10000), random.nextInt(20000), getRandomColor(), getRandomModelName()));
            } else {
                transportArrayList.add(
                        new Boat(random.nextInt(1000000), random.nextInt(100), random.nextInt(100), getRandomColor(),
                                getRandomTypeWaterTransport(), random.nextInt(30000), random.nextInt(10000)
                        ));
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
