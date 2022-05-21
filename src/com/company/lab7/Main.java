package com.company.lab7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(getRandomSquare());
    }

    public static int getRandomSquare() {
        return (int) (Math.random() * 50) + 5;
    }
}
