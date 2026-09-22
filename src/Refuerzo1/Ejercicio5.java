package Refuerzo1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int numero1,numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número entero: ");
        numero1 = sc.nextInt();
         if(numero1 == 0){
             System.out.println("El producto de 0 por cualquier número es 0");
         }else{
             System.out.println("Introduce el segundo número entero: ");
             numero2 = sc.nextInt();
             System.out.println("La multiplicación de estos números es: " + numero1 * numero2);
         }
    }
}
