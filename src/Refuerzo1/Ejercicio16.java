package Refuerzo1;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        num2 = sc.nextInt();
        System.out.println("Introduce el tercer número");
        num3 = sc.nextInt();
        if (num1 > num2 && num3 < num1){
            System.out.println("El númro más grande es: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("El número más  grande es: " + num2);
        }else{
            System.out.printf("El número más grande es: %d",num3);
        }
    }
}
