import java.util.Scanner;

public class Ejemplo20e {
    public static void main(String[] args) {

        double nota;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nota");
        nota = sc.nextDouble();
        System.out.println("¿Has entregado todas las prácticas? (si/no)");
        String practicas = sc.next();
        if(practicas.equals("si")){
            if(nota < 5){
                System.out.println("SUSPENSO");
            } else if (nota < 7) {
                System.out.println("APROBADO");
            } else if (nota < 9) {
                System.out.println("NOTABLE");
            }else {
                System.out.println("SOBRESALIENTE");
            }
        }else{
            if(nota <= 5){
                System.out.println("SUSPENSO POR PRÁCTICAS PENDIENTES");
            }else if (nota < 7) {
                System.out.println("APROBADO");
            } else if (nota < 9) {
                System.out.println("NOTABLE");
            }else {
                System.out.println("SOBRESALIENTE");
            }
        }
    }
}
