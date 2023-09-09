import java.util.Scanner;

public class Ejercicio42 {
    
static Scanner entrada = new Scanner(System.in);
static int n1, n2;

public static void main(String[] args) {
    
System.out.println("Digite el primer numero");
n1 = entrada.nextInt();

System.out.println("Digite el segundo numero");
n2 = entrada.nextInt();

if (n1<n2) {

    System.out.println("El numero menor es: " + n1);
    
} else {
    System.out.println("El numero menor es: " + n2);
}

}

}
