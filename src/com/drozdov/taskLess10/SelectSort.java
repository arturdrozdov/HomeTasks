package com.drozdov.taskLess10;

public class SelectSort {       //сортировка выборкой(или выбором)
    public static void main(String[] args) {
        int mass[] = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 50);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int min;
        int buff;
        for (int index = 0; index < mass.length; index++) {
            min = index;

            for (int j = index + 1; j < mass.length; j++) {


                if (mass[j] < mass[min])
                    min = j;
            }

            buff = mass[min];
            mass[min] = mass[index];
            mass[index] = buff;


        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
