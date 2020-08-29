package com.drozdov.tasksLesson2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите курс гривны к доллару. Ввод:");
        double kurs=in.nextDouble();
        System.out.println("Введите количество гривен для перевода в доллары. Ввод:");
        double summ=in.nextDouble();
        System.out.println("Вы получите "+summ/kurs+"$");
    }
}
