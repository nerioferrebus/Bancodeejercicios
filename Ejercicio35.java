import java.util.Scanner;

public class Ejercicio35 {

static Scanner entrada = new Scanner(System.in);

Scanner scanner = new Scanner(System.in);
  static int minutos, horas;
  static double fraccionHoras, tiempoTotalHoras, costoPorHora, costoTotal;     
    public static void main(String[] args) {
        
    
        System.out.print("Ingrese el tiempo de estacionamiento en horas: ");
         horas = entrada.nextInt();
        
        System.out.print("Ingrese el tiempo de estacionamiento en minutos: ");
         minutos = entrada.nextInt();
        
        // Convertir los minutos a fracción de horas
         fraccionHoras = minutos / 60.0;
        
        // Sumar las horas con la fracción de horas
         tiempoTotalHoras = horas + fraccionHoras;
        
        // Calcular el costo total
         costoPorHora = 15.00;
         costoTotal = tiempoTotalHoras * costoPorHora;
        
        System.out.println("Tiempo de estacionamiento: " + horas + " horas y " + minutos + " minutos");
        System.out.println("Costo total: $" + costoTotal);
        
    }
}
