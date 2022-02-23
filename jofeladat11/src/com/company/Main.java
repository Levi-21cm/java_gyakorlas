package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a befogot");
        double befogo1 = konzol.nextDouble();
        System.out.println("adja meg a befogot");
        double befogo2 = konzol.nextDouble();

        double atfogo = Math.sqrt((Math.pow(befogo1,2)+Math.pow(befogo2,2)));
        System.out.printf("a háromszöh átfogója %.2f cm",atfogo);
    }
}
