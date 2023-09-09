import java.util.Scanner;


public class Ejercicio12 {
    
static Scanner entrada = new Scanner(System.in);
static int n1, n2 , n3, media, suma, doble,triple,cuadruple;

public static void main(String[] args) {
    

System.out.println("Digite el primer numero");
n1= entrada.nextInt();

System.out.println(" Digite el segundo numero");
n2= entrada.nextInt();

System.out.println("Digite el tercer numero");
n3= entrada.nextInt();

suma= n1+n2+n3;

media= suma/3;

doble=n1+n1;
triple=n2+n2+n2;
cuadruple=n3+n3+n3+n3;

System.out.println("La suma de los numeros es " + suma);
System.out.println("===================================");
System.out.println("El promedio es: " + media);
System.out.println("===================================");
System.out.println("Doble de el primer numero es : " + doble);
System.out.println("El triple de el segundo numero es: " + triple);
System.out.println("El cuadruple de el tercer numero es: " + cuadruple);

}

}
