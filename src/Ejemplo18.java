import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        int horas,minutos,segundos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas");
        horas = sc.nextInt();
        System.out.println("Ingrese el numero de minutos");
        minutos = sc.nextInt();
        System.out.println("Ingrese el numero de segundos");
        segundos = sc.nextInt();
        segundos++;
        if(segundos == 60){
            segundos=0;
            minutos++;
            if(minutos == 60){
                minutos=0;
                horas++;
            }
        }
        System.out.printf("Hora: %d : %d : %d\n",horas,minutos,segundos);
    }
}
