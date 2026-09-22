package Refuerzo1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número entero: ");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("Tu número es múltiplo de 2");
        }else if(numero % 3 == 0){
            System.out.println("Tu número es múltiplo de 3");
        }else{
            System.out.println("Tu número no es muútiplo ni de 2 ni de 3");
        }
    }
}
