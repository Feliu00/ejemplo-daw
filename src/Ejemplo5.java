import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {

        float numero1;
        float numero2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el primer número");
        numero1 = scanner.nextFloat();
        System.out.println("Escribe el segundo número");
        numero2 = scanner.nextFloat();
        System.out.println("sum = " + (numero1 + numero2));
        System.out.println("sub = " + (numero1 - numero2));
        System.out.println("mult = " + (numero1 * numero2));
        System.out.println("div = " + (numero1 / numero2));
    }
}
