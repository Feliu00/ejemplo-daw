package Refuerzo1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número entero");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número entero");
        numero2 = sc.nextInt();
        if (numero1%2 == 0 && numero2%2 == 0) {
            System.out.println("Ambos números son pares");
        }else{
            System.out.println("Los 2 números no son pares");
        }
    }
}
