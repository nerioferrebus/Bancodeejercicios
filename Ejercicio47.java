import java.util.Scanner;
public class Ejercicio47 {
    
static Scanner entrada = new Scanner(System.in);
static double n1, n2, suma, resta, multiplicacion, division, modulo;
public static void main(String[] args) {

    System.out.println("Digite el primer numero");
    n1 = entrada.nextDouble();

    System.out.println("Digite el segundo numero");
    n2 = entrada.nextDouble();

    suma = n1+n2;
    resta = n1-n2;
    multiplicacion = n1*n2;

    if (n2!=0) {
        division = n1/n2;
        
    }

    modulo = n1 % n2;

    System.out.println(" Suma :" + suma);
    System.out.println(" Resta: " + resta);
    System.out.println("Multiplicacion:" + multiplicacion);
    if (n2!=0) {
         System.out.println("Division: " + division);
    } else {
        System.out.println("No se puede realizar la division");
              }

              System.out.println("Modulo: " + modulo);

            }


}
