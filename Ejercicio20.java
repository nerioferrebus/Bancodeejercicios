import java.util.Scanner;
public class Ejercicio20 {
    
static Scanner entrada = new Scanner(System.in);
static double n1, n2, n3 ,n4, n5, promedio, suma, doble;

public static void main(String[] args) {

System.out.println("Digite primera nota");
n1 = entrada.nextDouble();


System.out.println("Digite segunda nota");
n2 = entrada.nextDouble();


System.out.println("Digite tercera nota");
n3 = entrada.nextDouble();


System.out.println("Digite cuarta nota");
n4 = entrada.nextDouble();


System.out.println("Digite quinta nota");
n5 = entrada.nextDouble();

    suma=n1+n2+n3+n4+n5;
    promedio=suma/5;
    doble = suma+suma;

    System.out.println("La suma de las notas es: " + suma);
    System.out.println("El promedio de las notas es: " + promedio);
    System.out.println("El doble de las notas es: " + doble);


}
}
