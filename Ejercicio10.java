import java.util.Scanner;

public class Ejercicio10 {
    static Scanner entrada = new Scanner(System.in);
    static int base, altura, area;

    public static void main(String[] args) {

        System.out.println(" Programa para medir el area de un triangulo ");
        System.out.println("==============================================");

        System.out.println("DIGITE LA BASE");
        base = entrada.nextInt();

        System.out.println("DIGITE LA ALTURA");
        altura = entrada.nextInt();

        area = base*altura/2;

        System.out.println("El area de este triangulo es: " + area );



        
    }
}
