import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {

        float precio;
        float preciorebajado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio real");
        precio = scanner.nextFloat();
        System.out.println("introduce el precio rebajado");
        preciorebajado = scanner.nextFloat();
        System.out.println("descuento = " + (precio - preciorebajado)/precio*100);



    }
}
