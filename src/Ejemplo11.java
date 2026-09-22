import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número");
        numero2 = scanner.nextInt();

        if (numero1<=numero2){
            System.out.println("Orden ascendente:" + numero1 + " > " + numero2);
        }else{
            System.out.println("Orden ascendente:" + numero2 + " > " + numero1);
        }

    }
}
