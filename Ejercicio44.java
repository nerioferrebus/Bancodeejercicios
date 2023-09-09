import java.util.Scanner;

public class Ejercicio44 {
    
static Scanner entrada = new Scanner(System.in);
static int numero;
public static void main(String[] args) {
    
System.out.println("Digite un numero");
numero = entrada.nextInt();

if (numero<0) {

    System.out.println("-1");

    if(numero>0){

        System.out.println("1");
    }
    
} else {
 System.out.println("0");   
}

}

}
