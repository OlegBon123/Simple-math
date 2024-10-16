package org.example;

public class BitOperation {
    public static int setBit(int number, int bitIndex) {
        return number | (1 << bitIndex);
    }

    public static int clearBit(int number, int bitIndex) {
        return number & ~(1 << bitIndex);
    }

    public static void main(String[] args) {
        int number = 29;
        int bitIndex = 2;

        System.out.println("Число до змін: " + Integer.toBinaryString(number));

        int newNumber = setBit(number, bitIndex);
        System.out.println("Після увімкнення біта: " + Integer.toBinaryString(newNumber));

        newNumber = clearBit(newNumber, bitIndex);
        System.out.println("Після вимкнення біта: " + Integer.toBinaryString(newNumber));
    }
}
