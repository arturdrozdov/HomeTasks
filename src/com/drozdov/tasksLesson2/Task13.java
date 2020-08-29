package com.drozdov.tasksLesson2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество суток. Ввод:");
        int a=in.nextInt();
        int hour=24;
        int minute=1440;
        int second=86400;
        System.out.println("Количество часов в "+a+" сутках = "+hour*a);
        System.out.println("Количество минут в "+a+" сутках = "+minute*a);
        System.out.println("Количество секунд в "+a+" сутках = "+second*a);
    }
}
