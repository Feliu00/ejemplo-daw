package Refuerzo1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        int t,hora,minutos,segundos,segundosrestantes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo en segundos");
        t = sc.nextInt();
        hora = t / 3600;
        segundosrestantes = t % 3600;
        minutos = segundosrestantes / 60;
        segundos = segundosrestantes % 60;
        System.out.println("El tiempo en formato 00:00:00 es: " + hora + ":" + minutos + ":" + segundos);
    }
}
