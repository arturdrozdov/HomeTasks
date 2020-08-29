package com.drozdov.tasksLesson2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите желаемую для перевода в фаренгейты температуру в цельсиях. Ввод: ");
        double temp=in.nextDouble();
        double tempFarengeyt=((temp*9)/5)+32;
        System.out.println(tempFarengeyt+"°F");
    }
}
