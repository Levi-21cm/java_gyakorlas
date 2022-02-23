package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("Adja meg a téglatest egyyik élét");
        int a = konzol.nextInt();

        System.out.println("Adja meg a téglatest egyyik élét");
        int b= konzol.nextInt();

        System.out.println("Adja meg a téglatest egyyik élét");
        int c = konzol.nextInt();

        int felszin = 2*(a*b +a*c+b*c); //képlet alapján összeszoroztam
        int terfogat = a*b*c; //képlet alapján összeszoroztam
        System.out.printf("a téglatest felszine %d és a térfogata %d",felszin,terfogat);
    }
}
