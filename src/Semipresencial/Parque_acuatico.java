package Semipresencial;

import java.util.Scanner;

public class Parque_acuatico {
    public static void main(String[] args) {

        int entradas_infantiles, entradas_adultos;
        double total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de entradas infantiles");
        entradas_infantiles = sc.nextInt();
        System.out.println("Ingrese el numero de entradas para adultos");
        entradas_adultos = sc.nextInt();

        total = (entradas_infantiles * 15.50) + (entradas_adultos * 20);

        if (total >= 100) {
            System.out.printf("Importe total: %.2f€%n",total * 0.95);
        }else{
            System.out.printf("Importe total: %.2f€%n", total);
        }


    }
}
