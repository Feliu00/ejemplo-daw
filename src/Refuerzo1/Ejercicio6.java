package Refuerzo1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int numero1,numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número entero: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        numero2 = sc.nextInt();

        if(numero2 == 0){
            System.out.println("Error: No se puede dividir entre cero");
        }else{
            System.out.println("La división entre los dos números es: " + numero1/numero2);
        }
    }
}
