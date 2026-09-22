import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {

        float precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        precio = sc.nextInt();
        if (precio <6){
            System.out.println("Precio final = " + precio);
        } else if (precio < 60) {
            System.out.println("Precio final = " + (precio * (1-5.0/100)));
        }else {
            System.out.println("Precio final = " + (precio * (1-10.0/100)));
        }

    }
}
