package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg az óra");
        int ora1 = konzol.nextInt();
        System.out.println("adja meg az perc");
        int perc1 = konzol.nextInt();
        System.out.println("adja meg az másodperc");
        int masodperc1 = konzol.nextInt();

        System.out.println("adja meg az óra");
        int ora2 = konzol.nextInt();
        System.out.println("adja meg a perc");
        int perc2 = konzol.nextInt();
        System.out.println("adja meg a másodperc");
        int masodperc2 = konzol.nextInt();

        int kivonas = (ora1 *3600) + (perc1*60) + masodperc1;
        int kivonas2 = (ora2 *3600) + (perc2*60) + masodperc2;
        System.out.println(kivonas);
        System.out.println(kivonas2);
        if ((ora1<=24)&&(perc1<=60)&&(masodperc1<=60)&&(ora2<=24)&&(perc2<=60)&&(masodperc2<=60))
        if (kivonas-kivonas2<=0){
            System.out.printf("a két időpont között %d másodperc van",(kivonas-kivonas2)*(-1));
        }
        else {
            System.out.printf("A két időpont között %d másodperc van",kivonas-kivonas2);
        }
        else {
            System.out.println("a dátum nem jó");
        }
    }
}
