package Refuerzo1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = sc.nextInt();
        if (numero1 >= 0 && numero2 <= 0 || numero1 <= 0 && numero2 >= 0) {
            System.out.println("Uno de los números es positivo");
        }else if(numero1 >= 0 && numero2 >= 0){
            System.out.println("Los dos números son positivos");
        }else{
            System.out.println("Ninguno de los números es positivo");
        }
    }
}
