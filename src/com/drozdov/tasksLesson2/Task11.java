package com.drozdov.tasksLesson2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Таблица умножения на какое число, вас интересует? Ввод:");
        int a=in.nextInt();
        System.out.print(a+" ");
        for(int i=2; i<=10;i++)
            System.out.print(a*i+" ");


    }
}
