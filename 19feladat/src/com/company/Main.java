package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a pontszám");
        int pontszam = konzol.nextInt();

        if ((pontszam >= 0)&&(pontszam<=100)) {
            if (pontszam < 50){
                System.out.println("elégtelen");
            }
            else if ((pontszam >= 50)&&(pontszam<65)){
                System.out.println("elégséges");
            }
            else if ((pontszam >= 65)&&(pontszam<80)){
                System.out.println("közepes");
            }
            else if ((pontszam >= 80)&&(pontszam<90)){
                System.out.println("jó");
            }
            else if (pontszam >= 90){
                System.out.println("jeles");
            }
        }
        else {
            System.out.println("az érték nem jó");
        }
    }
}
