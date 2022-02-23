package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adjon egy szám");
        int szam = konzol.nextInt();
        System.out.printf("a bekért szám kétszerese %d" ,szam *2 );
    }
}
