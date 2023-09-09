import java.util.Scanner;
public class Ejercicio49 {
    
    static Scanner entrada = new Scanner(System.in);
    static int n1, n2, n3, suma, multiplicacion;

    public static void main(String[] args) {

        System.out.println("Digite numero uno");
        n1=entrada.nextInt();

        System.out.println("Digite numero dos");
        n2=entrada.nextInt();

        System.out.println("Digite numero tres");
        n3 = entrada.nextInt();

        suma = n1+n2+n3;
        multiplicacion = n1*n2*n3;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        

    }
}
