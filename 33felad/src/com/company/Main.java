package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol =new Scanner(System.in);
        System.out.println("Adjon meg egy szám");
        int szam = konzol.nextInt();
        int valami =0;
        int szam1=szam;
        while (szam -3 >0){//addi fut amíg a számból kivonunk 3at és nagyobb nula
            szam=szam-3;//elvonjuk a 3at
            valami=valami+1;//növelem a vátozót hogy tudjam hogy ennyi, azért hogy tudjuk mennyiszer vontuk ki a 3at
        }
        System.out.printf("%d = %d*3+%d",szam1,valami,szam);
    }
}
