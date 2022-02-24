package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите месяц от 1 до 12 ");
            int i = scan.nextInt();
            if (i > 12 | i <= 0) {
                System.out.println("неверно, жулик!");
                continue;
            }

            if (i >= 3 && i <= 5) {
                System.out.println("весна");
            }
            if (i >= 6 && i <= 8) {
                System.out.println("лето");
            }
            if (i >= 9 && i <= 11) {
                System.out.println("Осень");
            }
            if (i == 12 | i <= 2) {
                System.out.println("Зима");
            }

        }

    }
}