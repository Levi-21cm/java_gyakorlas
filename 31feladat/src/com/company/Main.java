package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a szám");
        int szam = konzol.nextInt();
        System.out.printf("%d = ",szam);

        while (szam %2 ==0){ //addi osztja kettővel amíg osztható kettővel
            szam=szam/2;//elosztja kettővel
            System.out.print("2*");//és hozzáadja a kiíráshoz
        }
        System.out.print(szam);
    }
}
