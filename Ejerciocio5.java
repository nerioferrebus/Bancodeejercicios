import java.util.Scanner;

public class Ejerciocio5 {

    static Scanner entrada = new Scanner(System.in);
    static double dg1, dg2, area;

    public static void main(String[] args) {
        
        System.out.println("Calculemos el area de un rombo");
        System.out.println("==============================================");

        System.out.println("Digite  la medica de una diagonal");
        dg1 = entrada.nextDouble();

        System.out.println("Digite la medida de la segunda diagonal");
        dg2 = entrada.nextDouble();

        area= dg1*dg2/2;

        System.out.println(" El area de este rombo es: " + area);

    }
}
