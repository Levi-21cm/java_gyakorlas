package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg körív");
        double koriv = konzol.nextDouble();
        System.out.println("adja meg középponti szög");
        double kozeppontiszog = konzol.nextDouble();

        double terulet = koriv / kozeppontiszog * 2 * Math.PI;
        double iv = koriv * kozeppontiszog/ Math.PI;
    }
}
