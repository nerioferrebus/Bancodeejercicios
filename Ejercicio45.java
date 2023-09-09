import java.util.Scanner;

public class Ejercicio45 {

    static Scanner entrada = new Scanner(System.in);
    static double distanciamillas, millasmetros;
    public static void main(String[] args) {
        
        System.out.println("Digite la distancia en millas");
        distanciamillas = entrada.nextDouble();

        millasmetros=distanciamillas*1852;

        System.out.println("La distancia ingresada en millas son: " + millasmetros + " metros");




    }
    
}
