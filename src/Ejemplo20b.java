import java.util.Scanner;

public class Ejemplo20b {
    public static void main(String[] args) {

        double consumo,importe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su consumo");
        consumo = sc.nextDouble();
        if (consumo <=100){
            importe = consumo * 0.10;
        } else if (consumo <= 300) {
            importe = (100 * 0.10) + (consumo - 100) * 0.15;
        }else{
            importe = (100 * 0.10) + (200 * 0.15) + (consumo * 0.20);
        }
        System.out.println("Importe: " + importe);
    }
}
