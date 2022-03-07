package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//létrehozunk egy konzol scannert

        System.out.print("Add meg a számot: ");//megkérjük milyen adatot vigyen be
        int szam1 = konzol.nextInt();//eltároljuk a szam változóban a be vitt adatot
        System.out.print("Add meg a számot: ");//megkérjük milyen adatot vigyen be
        int szam2 = konzol.nextInt();//eltároljuk a szam változóban a be vitt adatot

        int szam1forditott = szam1%10 *10 + szam1/10;
        int szam2forditott = szam2%10 *10 + szam2/10;
        if ((szam1 * szam2==szam1forditott*szam2forditott)){
            System.out.println("páros speciális szám");
        }
        else {
            System.out.println("nem páros speciális szám");
        }

    }
}
