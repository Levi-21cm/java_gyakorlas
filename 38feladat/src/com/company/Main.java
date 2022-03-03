package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adjon meg egy szám");
        int szam = konzol.nextInt();
        for (int i =1;i<=10;i++){
            System.out.println(i*szam);
        }
    }
}
