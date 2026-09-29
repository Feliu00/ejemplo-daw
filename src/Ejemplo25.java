import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {

        int num;
        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.printf("El factorial de %d es: %d", num, factorial);
    }
}
