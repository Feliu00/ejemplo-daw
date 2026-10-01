package Presencial;

import java.util.Scanner;

public class Bucles3 {
    public static void main(String[] args) {

        int num;
        int positivos = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num >= 0) {
                positivos = positivos + 1;
            }
        }
    }
}
