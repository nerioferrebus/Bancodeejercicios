import java.util.Scanner;
public class Ejercicio22 {

    static Scanner entrada = new Scanner(System.in);
    static double partentera, partedecimal, numero;

    public static void main(String[] args) {

        System.out.println( "Digite un numero entero");
        numero = entrada.nextDouble();

        partedecimal = numero % 1;
        partentera = numero - partedecimal;
      
        System.out.println("Parte entera : " + partentera);
        System.out.println(" Parte decimal: " + partedecimal);

        
    }


}
