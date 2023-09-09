import java.util.Scanner;
public class Ejercicio19 {
    
static Scanner entrada = new Scanner ( System.in);
static double sueldo; 
static double hrs_extra, pagoxhora, totalhora, descuento, totalganar ;
static double pagototal;

public static void main(String[] args) {
    

System.out.println("Digite su sueldo");
sueldo = entrada.nextInt();

System.out.println("Digite horas extra trabajadas");
hrs_extra = entrada.nextInt();

System.out.println("Digite pago por horas extra");
pagoxhora = entrada.nextInt();



totalhora=hrs_extra*pagoxhora;
pagototal=sueldo+totalhora;
descuento = pagototal *0.20;
totalganar = pagototal - descuento;

System.out.println("Tu sueldo total es de: " + pagototal);
System.out.println("El descuento es de el 20%: " + descuento);
System.out.println("Tu ganancia es de: " +  totalganar);



}

}
