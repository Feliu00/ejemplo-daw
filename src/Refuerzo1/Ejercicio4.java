package Refuerzo1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número entero: ");
        numero = sc.nextInt();
        if (numero % 10 == 0){
            System.out.println("Tu número es multiplo 10");
            System.out.println("Introduce el segundo número entero");
            numero = sc.nextInt();
            if (numero % 10 == 0){
                System.out.println("Tu número es multiplo 10");
            }else{
                System.out.println("Tu número no es multiplo 10");
            }

        }else{
            System.out.println("Tu número no es multiplo 10");
        }


    }
}
