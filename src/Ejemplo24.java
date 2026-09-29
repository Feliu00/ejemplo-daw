import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {

        double num,suma = 0, media;
        int contador = 0;
        boolean diez;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese sus notas: ");
        do {
            num = sc.nextDouble();
            if (num >= 0) {
                contador++;
                suma = suma + num;
                if (num == 10) {
                    diez = true;
                }
            }
        }while(num != -1);


        media = suma / contador;
        System.out.printf("Media: %.2f\n", media);
        System.out.println("Hay al menos un diez");

    }
}
