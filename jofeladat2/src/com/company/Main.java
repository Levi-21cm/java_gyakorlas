package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a nevét");
        String nev = konzol.nextLine();
        System.out.printf("Szia %s , kutyáidat sétáltatod?" , nev);
    }
}
