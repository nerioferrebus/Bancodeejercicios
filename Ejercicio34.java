import java.util.Scanner;
public class Ejercicio34 {

    static Scanner entrada = new Scanner(System.in);
    static double tarifaxhora, horastrabajadas, pagototal, horasextra, pagoxhoraex, pagofinal;

    public static void main(String[] args) {
        
        System.out.println("Sueldo de un profesor");
        System.out.println("==============================");
        System.out.println("Digite su tarifa por horas");
        tarifaxhora = entrada.nextDouble();
        
        System.out.println("Digite horas trabajadas");
        horastrabajadas = entrada.nextDouble();

        if (horastrabajadas>40) {
            
            System.out.println("Digite cuantas horas extra trabajo");
            horasextra = entrada.nextDouble();

            pagototal=tarifaxhora*horastrabajadas; 
            pagoxhoraex = tarifaxhora*0.50;
            pagofinal = pagototal+pagoxhoraex;

            System.out.println("Su pago por horas es de : " + tarifaxhora);
            System.out.println("Y trabajo: " + horastrabajadas + "horas");
            System.out.println("Tuvo: " + horasextra + "horas extra pagadas un 50% mas de el valor de la tarifa");
            System.out.println("Por lo tant tiene un pago de tarifa de: " + pagototal);
            System.out.println("Horas extras de: " + pagoxhoraex);
            System.out.println("Su monto total a pagar es de : " + pagofinal);
        

            
        } else {
            pagofinal = tarifaxhora*horastrabajadas;
            System.out.println("Su pago por horas es: " + tarifaxhora);
            System.out.println("Y trabajo: " + horastrabajadas + "horas");
            System.out.println("Su monto total a pagar es de: " + pagofinal );
            
        }
    }
    
}
