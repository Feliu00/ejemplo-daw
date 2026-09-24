package Refuerzo1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = sc.nextInt();
        if (numero1%2 == 0 && numero2%2 != 0 || numero1%2 != 0 && numero2%2 == 0) {
            System.out.println("Solo un número es par");
        }else{
            System.out.println("O los 2 números son pares o ninguno lo es");
        }
    }
}
