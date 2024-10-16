package org.example;

public class SequenceSum {
    public static void main(String[] args) {
        double a0 = 1.0;
        double sum = a0;
        double an = a0;

        for (int n = 1; n < 10; n++) {
            an = an + (double) n / (n + 1);
            sum += an;
        }

        System.out.println("Сума перших 10 членів послідовності: " + sum);
    }
}
