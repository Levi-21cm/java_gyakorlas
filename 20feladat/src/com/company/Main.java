package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adj egy számot");
        int szam1 = konzol.nextInt();


        System.out.println("adj egy számot");
        int szam2 = konzol.nextInt();

        for (int i =0; i !=3; i++){
            int veltlenszam = (int) ((Math.random()*szam2)+szam1);
            System.out.println(veltlenszam);
        }
    }
}
