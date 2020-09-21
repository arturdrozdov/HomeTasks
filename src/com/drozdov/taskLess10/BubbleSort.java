package com.drozdov.taskLess10;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mass[] = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 50);
        }
        System.out.print("Start mass: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    sort = false;
                    int buff = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = buff;

                }
            }
        }
        System.out.print("Sorted mass: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");

        }
    }
}
