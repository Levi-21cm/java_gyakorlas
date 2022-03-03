package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a szám");
        int szam = konzol.nextInt();
        boolean prim = true;
        for (int j = 0; j <= szam; j++){
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    prim = false;
                }
            }
        if (j < 2) {
            prim = false;
        }
        if (prim==true) {
            System.out.println(j);
        } else {

        }
    }}
    }
