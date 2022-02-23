package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a kordináta");
        int kordinata1 = konzol.nextInt();

        System.out.println("adja meg a kordináta");
        int kordinata2 = konzol.nextInt();

        System.out.println("adja meg a kordináta");
        int kordinata3 = konzol.nextInt();

        System.out.println("adja meg a kordináta");
        int kordinata4 = konzol.nextInt();

        double tavolsag = Math.sqrt((kordinata1 - kordinata2) * (kordinata1 - kordinata2) + (kordinata4 + kordinata3) * (kordinata4 + kordinata3));//képlet alapján csináltam
        System.out.printf("a kát kordináta távolsága: %f ",tavolsag);
    }


}
