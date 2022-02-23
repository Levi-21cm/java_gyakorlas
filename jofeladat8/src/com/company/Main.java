package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adjon meg egy szám");
        int szam1 = konzol.nextInt();
        System.out.println("adjon meg egy szám");
        int szam2 = konzol.nextInt();

        double szamtani = (szam1+szam2)/2;
        double mertani = Math.sqrt(szam1*szam2);
        System.out.printf("A két szám számtani közép %f és mértani közép %f ",szamtani,mertani);

    }
}
