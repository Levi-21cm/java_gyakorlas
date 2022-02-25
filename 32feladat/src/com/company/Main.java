package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("irja be az alma szót");
        String alma = konzol.nextLine();
        if (alma.equals("alma")){
            System.out.println("az alma gyümölcs!");
        }
        else {
            System.out.printf("a %s nem gyümölcs" , alma);
        }
    }
}
