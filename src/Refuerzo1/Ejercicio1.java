package Refuerzo1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero entero:");
        numero = sc.nextInt();

        System.out.println("El doble de este número es:" + numero * 2);
        System.out.println("El triple de este número es:" + numero * 3);
    }
}
