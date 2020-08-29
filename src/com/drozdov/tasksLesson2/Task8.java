package com.drozdov.tasksLesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = in.nextInt();
        if (a%2==0)
            System.out.println("Ваше число - чётное!");
        else System.out.println("Ваше число - нечётное!");

    }
}
