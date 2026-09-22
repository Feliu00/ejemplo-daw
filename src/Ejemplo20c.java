import java.util.Scanner;

public class Ejemplo20c {
    public static void main(String[] args) {

        int lado1,lado2,lado3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introuce el lado 1: ");
        lado1 = sc.nextInt();
        System.out.print("Introduce el lado 2: ");
        lado2 = sc.nextInt();
        System.out.print("Introduce el lado 3: ");
        lado3 = sc.nextInt();

        if((lado1+lado2 >= lado3) && (lado1+lado3 >= lado2) && (lado3+lado2 >= lado1)){
            System.out.println("ES UN TRIANGULO");
            if(lado1==lado2 && lado2 ==lado3){
                System.out.println("Triangulo equilátero");
            }
            if(lado1==lado2 || lado1==lado3 || lado2 ==lado3){
                System.out.println("Triangulo isósceles");
            }
            else{
                System.out.println("Triangulo escaleno");
            }
        }else{
            System.out.println("NO ES UN TRIANGULO");
        }




    }
}
