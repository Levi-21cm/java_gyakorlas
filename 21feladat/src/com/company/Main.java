package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adj egy számot");
        double szeles = konzol.nextDouble();

        System.out.println("adj egy számot");
        double magas = konzol.nextDouble();

        double terulet = szeles * magas;//terület ami kell
        double csempe = 0.2*0.2;//egy csempe
        double osszeg= terulet/csempe;//kiszáoljuk mennyi kell
        osszeg = osszeg*1.1;//10 százalékkal megnöveljük

        System.out.println("szükséges csempemennyiség : "+osszeg);
    }
}
