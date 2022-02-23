package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.println("adja meg a kör átmérőjét");
        double atmero = konzol.nextDouble();
        double kerulet = atmero *2* Math.PI;//meghívtam a math függvényt és segítségével képlet alapján megcsináltam
        double terulet = Math.pow(atmero,2) * Math.PI; //-II-
        System.out.printf("A kör felszine %f és területe %f", kerulet,terulet);
    }
}
