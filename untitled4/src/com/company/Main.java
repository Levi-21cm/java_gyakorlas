package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.println("adja meg a testsúját kg-ban: ");
        double suj = konzol.nextDouble();

        System.out.println("adja meg a magasságát cm-ben: ");
        double magaqssak = konzol.nextDouble();

        double testomegindex = suj /Math.pow(magaqssak/100,2);

        if (testomegindex <16){
            System.out.println("Sovány");
        }
        else if ((testomegindex > 18)&&(testomegindex<25)) {
            System.out.println("normális");
        }
        else {
            System.out.println("elhízott");
        }
    }
}
