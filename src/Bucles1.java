import java.util.Scanner;

public class Bucles1 {
    public static void main(String[] args) {

        int num;
        int positivos = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num != 0) {
            if (num >= 0) {
                positivos = positivos + 1;
            }
            num = sc.nextInt();
        }
    }
}
