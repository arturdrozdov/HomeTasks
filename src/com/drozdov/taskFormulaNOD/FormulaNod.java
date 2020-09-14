package com.drozdov.taskFormulaNOD;

import java.util.Scanner;

public class FormulaNod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 целых числа для нахождения наибольшего общего делителя.Ввод:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(nod(a, b));

    }

    static int nod(int a, int b) {


        while (b != 0) {
            int c;
            if (a < b)
                c = b % a;
            else c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
