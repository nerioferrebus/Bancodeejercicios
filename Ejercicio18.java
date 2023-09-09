import java.util.Scanner;

public class Ejercicio18 {
    
    static Scanner entrada = new Scanner(System.in);
    static int nro;

    public static void main(String[] args) {
        
        System.out.println("Calculemos el cuadrado de un numero");
        System.out.println("Digite un numero");
        nro = entrada.nextInt();

        nro = nro*nro;

        System.out.println("El cuadrado de el numero es: " + nro);


    }

}
