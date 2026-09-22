import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {

        float radio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el radio de la circunferencia");
        radio = scanner.nextFloat();
        System.out.println("longitud = " + (2*Math.PI*radio));
        System.out.println("área = " + (Math.PI*radio*radio));
    }
}
