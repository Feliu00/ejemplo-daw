package Refuerzo1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero entero:");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Tu número es par");
        }else{
            System.out.println("Tu numero es impar");
        }
    }
}
