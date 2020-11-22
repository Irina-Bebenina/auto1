package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        int difference = boundary - amount % boundary;

        if (amount % 1000 != 0) {
            System.out.println("Сделайте покупку на " + difference + " руб");
            return difference;
        }
        return difference;
    }
}


