package ru.netology.osnovuavtomatizacii;

public class CashbackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
