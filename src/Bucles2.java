import java.util.Scanner;

public class Bucles2 {
    public static void main(String[] args) {

        int num;
        int positivos = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        do {
            num = sc.nextInt();
            if (num >= 0) {
                positivos = positivos + 1;
            }
        }while (num != 0);
    }
}
