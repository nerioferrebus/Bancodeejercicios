import java.util.Scanner;

public class Ejercicio30 {

    static Scanner entrada = new Scanner(System.in);
    static double kilometros, metros;

    public static void main(String[] args) {

        System.out.println("Digite la distancia en kilometros que quiere convertir a metros");
        kilometros = entrada.nextDouble();

        metros = kilometros*1000;
        
        System.out.println("Los kilometros ingresados son: " + kilometros);
        System.out.println("  Que en metros serian:   " + metros);
        
    }
    
}
