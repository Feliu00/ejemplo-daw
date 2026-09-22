import java.util.Scanner;
import java.util.concurrent.atomic.LongAccumulator;

public class Ejemplo4 {
    public static void main(String[] args) {

        float lado;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Pon el lado");
        lado = scanner.nextFloat();
        System.out.println("El área es:" + lado * lado);

    }
}
