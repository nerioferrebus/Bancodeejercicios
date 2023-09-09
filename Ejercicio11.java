import java.util.Scanner;


public class Ejercicio11 {
    
static Scanner entrada = new Scanner(System.in);
static double ancho, largo, area;

public static void main(String[] args) {
    
    System.out.println("El areaa de un rectangulo" );
    System.out.println("==========================");

    System.out.println("Digite el amcho");
    ancho=entrada.nextDouble();

    System.out.println("Digite el largo");
    largo=entrada.nextDouble();

    area = largo*ancho;

    System.out.println(" El area de este rectangulo es de : " + area);
}

}
