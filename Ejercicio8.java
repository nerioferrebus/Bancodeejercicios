import java.util.Scanner;


public class Ejercicio8 {
    
    static Scanner entrada = new Scanner(System.in);
    static int numerador, divisor, resto;

    public static void main(String[] args) {
        
        System.out.println("El resto de una division");
        System.out.println("============================");

        System.out.println("Digite el numerador");
        numerador = entrada.nextInt();

        System.out.println("Digite el divisor");
        divisor = entrada.nextInt();

        resto = numerador%divisor;

        System.out.println("El resto de esta division es: " + resto);

    }
    

}
