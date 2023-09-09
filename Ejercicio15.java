import java.util.Scanner;

public class Ejercicio15 {

    static Scanner entrada = new Scanner(System.in);
    static int edad;
       
    public static void main(String[] args) {
        
        System.out.println("Digite su edad");
        edad = entrada.nextInt();

        if (edad<18) {

            System.out.println("Eres menor de edad");
            
        } else {

            System.out.println("Eres mayor de edad");
            
        }

    }

}
