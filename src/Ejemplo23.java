import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {

        int num;
        int positivos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese los números: ");
        do{
            num = sc.nextInt();
            if(num > 0){
            positivos++;
            }
        }while(num != 0);
        System.out.printf("Hay %d números positivos\n", positivos);
    }
}
