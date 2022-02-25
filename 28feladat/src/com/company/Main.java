package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("Hatványalap: ");
        int hatvanyalap = konzol.nextInt();
        System.out.println("Hatványkitevő: ");
        int hatvanykitevo = konzol.nextInt();

       System.out.printf("Hatványérték: %f", Math.pow(hatvanyalap,hatvanykitevo));//a math függvény segítségével a hatvényalapot a hatvány kitevőedikre emelem
    }
}
