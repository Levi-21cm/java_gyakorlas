package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        int pozitivszam = 0;
        do {
            System.out.println("adjon meg egy pozitív szám: ");
            pozitivszam = konzol.nextInt();
        }
        while (pozitivszam<= 0);

        }
    }

