package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adjon meg egy szám");
        int szam1 = konzol.nextInt();
        System.out.println("adjon meg egy szám");
        int szam2 = konzol.nextInt();
        System.out.println("adjon meg egy szám");
        int szam3 = konzol.nextInt();

        if ((szam1<szam2) && (szam1<szam3)){
            System.out.println("az első a legkissebb");
        }
        else if ((szam2<szam1) && (szam2<szam3)){
            System.out.println("az második a legkissebb");
        }
        else if ((szam3<szam2) && (szam3<szam1)){
            System.out.println("az harmadik a legkissebb");
        }
    }
}
