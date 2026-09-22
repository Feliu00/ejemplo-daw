import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {

        float edad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        edad = scanner.nextFloat();
        if (edad >= 18){
            System.out.println("Mayor de edad");
        }
        if (edad <18) {
            System.out.println("Menor de edad");
        }
    }

}
