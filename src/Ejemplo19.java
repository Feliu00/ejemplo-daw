import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {

       int horas;
       double preciohora;
       double SalarioBruto;
       double impuestos;
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce el número de horas");
       horas = sc.nextInt();
       System.out.println("Introduce el precio por hora");
       preciohora = sc.nextDouble();
       if (horas <= 35){
           SalarioBruto = (preciohora * horas);
       }else{
           SalarioBruto = (35 * preciohora)+(horas - 35) * (preciohora * 1.35);
       }

       if (SalarioBruto <= 500){
           impuestos = 0;
       } else if (SalarioBruto < 900) {
           impuestos = (SalarioBruto - 500) * 0.25;
       }else {
           impuestos =  (400 * 0.25) +  ((SalarioBruto-900) * 0.45);
       }
        System.out.println("salario bruto: " + SalarioBruto);
       System.out.println("impuestos: " + impuestos);
        System.out.println("Salario neto: " + (SalarioBruto - impuestos));
    }
}