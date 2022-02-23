package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a befogot");
        int szam = konzol.nextInt();

        if ((szam %3==0)&&(szam %4==0)&&(szam%9==0)){ //a feltételben az szerepel hogy ha a szám osztható 3al úgy hogy a  maradék nulla akkor igaz , igy a többi feltétel és logiaki elválasztva
            System.out.println("ez a szám osztható 3-al ,4-gyel és 9-el");
        }
    }
}
