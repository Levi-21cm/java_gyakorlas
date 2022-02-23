package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a Celsiust");
        double C = konzol.nextDouble();

        System.out.println("adja meg a fáremheijt");
        double F = konzol.nextDouble();

        double FtoC = C * 1.8 +32;
        double CtoF = (F-32)/1.8;

        System.out.printf("Az egyik %f C° a másik %f F°",FtoC,CtoF);
    }
}
