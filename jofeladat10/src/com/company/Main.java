package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adjon meg egy szám");
        double a = konzol.nextDouble();

        System.out.println("adjon meg egy szám");
        double b = konzol.nextDouble();

        System.out.println("adjon meg egy szám");
        double c = konzol.nextDouble();

        double diszkrimináns = Math.sqrt(Math.pow(b,2)-4*a*c);
        if (diszkrimináns > 0){
            double megoldas1elso = (-b + diszkrimináns)/2*a;
            double megoldas1masodik = (-b - diszkrimináns)/2*a;
            System.out.printf("az egyenletnek 2 megoldása van x1=%f és x2=%f",megoldas1elso,megoldas1masodik);
        }
        else if (diszkrimináns==0){
            double megoldas2 = (-b)/(2*a);
            System.out.printf("az egyenletnek 1 megoldása van x1=x2=%f" , megoldas2);
        }
        else {
            System.out.println("az egyenletnek nincs megoldása");
        }
    }
}
