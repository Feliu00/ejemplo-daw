package Refuerzo1;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println("Los números son iguales");
        }else{
            if(num1 > num2){
                System.out.println("El número mayor es: " + num1);
            }else{
                System.out.println("El número mayor es: " + num2);
            }
        }
    }
}
