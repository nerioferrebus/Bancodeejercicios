import java.util.Scanner;

public class Ejercicio9 {
    
static Scanner entrada = new Scanner(System.in);
static double precio, iva, totalpagar;

public static void main(String[] args) {
    
System.out.println("Digite el valor");
precio = entrada.nextDouble();

iva = precio*0.16;

totalpagar = iva+precio;

System.out.println("El valor del producto es de: " + precio);
System.out.println("Mas iva el 16%" + iva);
System.out.println("Valor a pagar: " + totalpagar);



}

}
