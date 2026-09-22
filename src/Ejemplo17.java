import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {

        String mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mes");
        mes = sc.nextLine();
        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("Tiene 31 días");
                break;
            case "febrero":
                System.out.println("Tiene 28 días");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("Tiene 30 días");

        }
    }
}
