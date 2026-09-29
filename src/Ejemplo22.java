import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {

        int num;
        int positivos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese 10 números: ");

        for (int i = 1; i <=10; i++) {
            num = sc.nextInt();
            if (num >=0){
                positivos++;
            }
        }
        System.out.printf("Has introducido %d números positivos\n", positivos);
    }
}
