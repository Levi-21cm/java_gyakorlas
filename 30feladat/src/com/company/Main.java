package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        int szam = 0;
        int osszeg =0;
        while (szam  <=10){
            System.out.println("adja meg egy szám");
            szam=konzol.nextInt();
            osszeg = osszeg+szam;
        }
        System.out.println(osszeg);
    }
}
