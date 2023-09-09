import java.util.Scanner;

public class Ejercicio7 {

    static Scanner entrada = new Scanner(System.in);
    static int nro;

    public static void main(String[] args) {
        
        System.out.println("Digite el numero");
        nro = entrada.nextInt();

        if (nro>0) {

            System.out.println("El numero es positivo");
            
        } else {
            
            System.out.println("El numero es negativo");

        }

    }


}
