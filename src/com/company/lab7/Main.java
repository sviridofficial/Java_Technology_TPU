package com.company.lab7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Room[] floorFirst = new Room[20];
        ArrayList<Room> floorSecond = new ArrayList<>();
        LinkedList<Room> floorThird = new LinkedList<>();

        for (int i = 0; i < 7; i++) {
            floorFirst[i] = new Room(getRandomRoomType(), getRandomSquare());
            floorSecond.add(new Room(getRandomRoomType(), getRandomSquare()));
            floorThird.add(new Room(getRandomRoomType(), getRandomSquare()));
        }

    }

    public static int getRandomSquare() {
        return (int) (Math.random() * 50) + 5;
    }

    public static RoomTypes getRandomRoomType() {
        ArrayList<RoomTypes> typesRoom = new ArrayList<>();
        typesRoom.add(RoomTypes.LIVING_ROOM);
        typesRoom.add(RoomTypes.BATHROOM);
        typesRoom.add(RoomTypes.BEDROOM);
        typesRoom.add(RoomTypes.KITCHEN);
        return typesRoom.get(new Random().nextInt(4));
    }
}
