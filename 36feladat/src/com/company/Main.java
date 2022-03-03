package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol =new Scanner(System.in);
        System.out.println("adjon meg egy szám");
        int a = konzol.nextInt();
        System.out.println("adjon meg egy szám");
        int b = konzol.nextInt();
        int x = a;
        int y = b;
        int m = 0;
        do {
            m = a % b;
            a = b;
            b = m;
        } while (m != 0);
        System.out.println("Inko= "+a);
        System.out.println("lkkt= " +((x*y)/a));
    }
}
