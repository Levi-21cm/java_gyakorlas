package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adjon meg egy szám");
        double szam1 = konzol.nextDouble();
        System.out.println("adjon meg egy szám");
        double szam2 = konzol.nextDouble();
        System.out.printf("a két szám összege %f különbségük %f szorzatuk %f és hányadosuk %f", szam1 + szam2, szam1-szam2, szam1*szam2, szam1/szam2);
    }
}
