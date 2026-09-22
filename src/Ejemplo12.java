import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos valores");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        if(numero1>=numero2){
            System.out.println("El más grande es " + numero1);
        }else{
            System.out.println("El más grande es " + numero2);
        }

    }
}
