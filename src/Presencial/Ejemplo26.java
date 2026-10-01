package Presencial;

import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {

        int num;
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.printf("%d * %d = %d\n", num, i, resultado);
        }
    }
}
