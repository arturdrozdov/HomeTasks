package com.drozdov.tasksLesson2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите расстояние до места назначения в км; Ввод:");
        int s=in.nextInt();
        System.out.println("Введите время за которое нужно доехать в часах; Ввод:");
        int t=in.nextInt();
        System.out.println("Вам нужно двигаться со скоростью "+s/t+"км/ч");
    }
}
