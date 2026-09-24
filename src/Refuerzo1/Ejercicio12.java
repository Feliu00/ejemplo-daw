package Refuerzo1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        int numero1,numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        numero2 = sc.nextInt();
        if(numero1%2 ==0 || numero2%2 ==0){
            System.out.println("Al menos uno de los 2 números es par");
        }else{
            System.out.println("Ningun número es par");
        }
    }
}
