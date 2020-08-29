package com.drozdov.tasksLesson2;

public class Task6 {
    public static void main(String[] args) {
        double mass[]={1,2,3,4,5};
        mass[1]=mass[1]+(mass[1]*10)/100;
        System.out.println(mass[1]);
        for(int i=0;i<mass.length;i++)
            System.out.print(mass[i]+" "); //вывел весь массив
    }
}
