import java.util.Scanner;

public class Ejemplo20d {
    public static void main(String[] args) {

        double importe;
        double descuento = 0;
        double importefinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la importe");
        importe = sc.nextDouble();
        System.out.println("¿Eres socio? (si/no)");
        String socio = sc.next();
        if(socio.equals("si")){
            if(importe>100){
                descuento = 0.15;
            } else if (importe>50) {
                descuento = 0.10;
            }
        }else{
            if(importe>=50){
                descuento = 0.05;
            }
        }
        importefinal = importe - (importe * descuento);
        System.out.println("La importe final es: " + importefinal);
    }
}
