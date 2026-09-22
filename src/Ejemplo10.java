import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {

        int valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un valor");
        valor = scanner.nextInt();
        if (valor >= 0) {
            System.out.println("Su valor es positivo");
        } else {
            System.out.println("Su valor es Negativo");
        }
    }
}

