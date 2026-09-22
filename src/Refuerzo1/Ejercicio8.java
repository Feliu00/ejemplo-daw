package Refuerzo1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero entero: ");
        numero = sc.nextInt();

        if(numero % 2 == 0 && numero % 3 == 0){
            System.out.println("El número es simultaniamente múltiplo de 2 y de 3");
        }else{
            System.out.println("Tu número no es simultaniamente múltiplo de 2 y de 3");
        }
    }
}
