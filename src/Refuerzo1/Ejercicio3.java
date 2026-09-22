package Refuerzo1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int numero1,numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero entero:");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero entero:");
        numero2 = sc.nextInt();

        if(numero1%numero2==0){
            System.out.println("Los números son multiplos");
        }else{
            System.out.println("Los números no son multiplos");
        }
    }
}
