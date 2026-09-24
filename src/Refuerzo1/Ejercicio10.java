package Refuerzo1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número entero");
        numero = sc.nextInt();
        if(numero%2 != 0 && numero%3 != 0){
            System.out.println("El número no es múltiplo ni de 2 ni de 3");
        }else{
            System.out.println("El número no cumple la condición");
        }


    }
}
