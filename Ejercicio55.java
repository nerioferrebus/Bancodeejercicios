import java.util.Scanner;
public class Ejercicio55 {
    
static Scanner entrada = new Scanner(System.in);
static float minutos, horas, segundos;

public static void main ( String[] args){

System.out.println("Digite los segundos que quiere convertir");
segundos = entrada.nextInt();

minutos = segundos/60;
horas= segundos /3600;

System.out.println("Los segundos digitados son:  " + segundos);
System.out.println("En minutos son: " + minutos);
System.out.println("En horas: " + horas);

}

}
