package Semipresencial;

import java.util.Scanner;

public class Calculos_IVA {
    public static void main(String[] args) {

        double importe, porcentaje;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el importe");
        importe = input.nextDouble();
        System.out.println("Ingrese el porcentaje");
        porcentaje = input.nextDouble();

        System.out.printf("Importe total: %.2f%n ", (importe * (1 + porcentaje / 100)));
        System.out.printf("Importe correspondiente al iva: %.2f%n ", (importe * (porcentaje / 100)));



    }
}
