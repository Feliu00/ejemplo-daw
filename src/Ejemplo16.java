import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        String operacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        numero2 = sc.nextInt();
        System.out.println("Introduce la operación");
        operacion = sc.next();
        switch (operacion) {
            case "+":
                System.out.printf("El resultado de sumar %d y%d es: %d %n", numero1, numero2, numero1 + numero2);
                break;
            case "-":
                System.out.printf("El resultado de restar %d y %d es: %d %n", numero1, numero2, numero1 - numero2);
                break;
            case "*":
                System.out.printf("El resultado de multiplicar %d y %d es: %d %n", numero1, numero2, numero1 * numero2);
                break;
            case "/":
                System.out.printf("El resultado de dividir %d y %d es: %d %n", numero1, numero2, numero1 / numero2);
                break;
                default:
                    System.out.println("Opeación no valida");
                    break;

        }



    }
}
