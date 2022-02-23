package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adjon meg egy szám");
        int szam1 = konzol.nextInt();
        System.out.println("adjon meg egy szám");
        int szam2 = konzol.nextInt();
        if (szam1>szam2){
            System.out.println("Az első a nagyobb");
        }
        else if (szam2>szam1){
            System.out.println("a második szám a nagyobb");
        }
        else {
            System.out.println("egyenlő");
        }
    }
}
