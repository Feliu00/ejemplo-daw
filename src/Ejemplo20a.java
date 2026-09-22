import java.util.Scanner;

public class Ejemplo20a {
    public static void main(String[] args) {

        double peso, altura, IMC;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su peso: ");
        peso = sc.nextDouble();

        System.out.print("Ingrese su altura: ");
        altura = sc.nextDouble();

        IMC = peso/(altura*altura);
        if (IMC < 18.5) {
            System.out.println("Bajo peso");
        }else  if (IMC < 25) {
            System.out.println("Normal");
        } else if (IMC < 30 ) {
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obesidad");
        }


    }
}
