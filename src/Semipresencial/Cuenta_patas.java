package Semipresencial;

import java.util.Scanner;

public class Cuenta_patas {
    public static void main(String[] args) {

        int hormigas, aranas, cochinillas, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de hormigas capturadas");
        hormigas = sc.nextInt();
        System.out.println("Ingrese el número de arañas capturadas");
        aranas = sc.nextInt();
        System.out.println("Ingrese el númeo de cochinillas capturadas");
        cochinillas = sc.nextInt();

        total = (hormigas * 6) + (aranas * 8) + (cochinillas * 14);
        System.out.printf("Número total de patas: %d%n", total);


    }
}
