import java.util.Scanner;
public class Ejercicio36 {

    
static int horas, minutos;
static double tiempoTotalHoras, costoPorHora, costoTotal;
static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Ingrese el tiempo de estacionamiento en horas: ");
         horas = entrada.nextInt();
        
        System.out.print("Ingrese el tiempo de estacionamiento en minutos: ");
         minutos = entrada.nextInt();
        
        // Calcular el tiempo total en horas y minutos
         tiempoTotalHoras = horas + (minutos / 60.0);       
        
        // Aplicar la regla de cobro después de una hora
        if (minutos > 10) {
            tiempoTotalHoras = Math.ceil(tiempoTotalHoras); // Redondear hacia arriba
        }
        
        // Calcular el costo total
         costoPorHora = 15.00;
         costoTotal = tiempoTotalHoras * costoPorHora;
        
        System.out.println("Tiempo de estacionamiento: " + horas + " horas y " + minutos + " minutos");
        System.out.println("Costo total: $" + costoTotal);
        
    
}
}