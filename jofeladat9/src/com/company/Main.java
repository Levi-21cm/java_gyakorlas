package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adjon meg egy szám");
        int a = konzol.nextInt();

        System.out.println("adjon meg egy szám");
        int b = konzol.nextInt();

        System.out.println("adjon meg egy szám");
        int c = konzol.nextInt();

        double diszkrimináns = Math.sqrt(Math.pow(b,2)-4*a*c);
        if (diszkrimináns > 1){
            System.out.println("az egyenletnek 2 megoldása van");
        }
        else if (diszkrimináns==1){
            System.out.println("az egyenletnek 1 megoldása van");
        }
        else {
            System.out.println("az egyenletnek nincs megoldása");
        }
    }
}
