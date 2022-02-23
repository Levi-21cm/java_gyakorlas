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

        if ((a + b > c)&&(a +c > b)&&(b + c > a)){
            System.out.println("a háromszök szerkeszthető");
        }
        else {
            System.out.println("a háromszög nem szerkeszthető");
        }
    }
}
