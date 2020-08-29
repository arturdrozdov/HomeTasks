package com.drozdov.tasksLesson2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите дробное число с разделителем ',': ");
        double a=in.nextDouble();
        int b=(int) a;
        // System.out.println(b);
        double c=(double)b;
       // System.out.println(c);
        if (a-c==0)
            System.out.println("Число целое!");         // пример: вводим 34,45 далее приводим его к int получаем 34
        else                                            // затем привожу 34 к double получаем 34,0
            System.out.println("Число не целое!");      // отнимаем от 34,45-34,0 >> есть остаток, значит не целое
    }
}
