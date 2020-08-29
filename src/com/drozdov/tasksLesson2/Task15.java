package com.drozdov.tasksLesson2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите катет 'a' прямоугольного треугольника. Ввод:");
        double a=in.nextDouble();
        System.out.println("Введите катет 'b' прямоугольного треугольника. Ввод:");
        double b=in.nextDouble();

        System.out.println("Площадь прямоугольного треугольника равна: "+square(a,b));
        System.out.println("Периметр прямоугольного треугольника равен: "+perimetr(a,b));
        System.out.println("Гипотенуза прямоугольного треугольника равна: "+gip(a,b));
    }
    static double square(double a, double b){
        double s=(a*b)/2;
        return s;
    }
    static double perimetr(double a, double b){
        double gip=Math.sqrt((a*a)+(b*b));
        double res=a+b+gip;
        return res;
    }
    static double gip(double a, double b){
        double gip=Math.sqrt((a*a)+(b*b));
        return gip;

    }
}
