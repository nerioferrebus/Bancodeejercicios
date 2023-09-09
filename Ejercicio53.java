import java.util.Scanner;

public class Ejercicio53 {
    
static Scanner entrada = new Scanner(System.in);
static double centimetros, pulgadas;
public static void main(String[] args) {
    
System.out.println("Digite los centimetros que quiere convertir  a pulgadas");
centimetros = entrada.nextFloat();

pulgadas = centimetros/2.54;

System.out.println("Los centimetros " + centimetros + " en pulgadas son " + pulgadas);

}

}
