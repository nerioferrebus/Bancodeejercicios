import java.util.Scanner;

public class Ejercicio46 {
    
static Scanner entrada = new Scanner(System.in);
static double cantidad, pagado, precio, descuento;

public static void main(String[] args) {
    
    System.out.println("Escriba cantidad de la compra");
    cantidad = entrada.nextDouble();

    System.out.println("Escribe el precio de la compra");
    precio = entrada.nextDouble();

    System.out.println("Escribe el total pagado");
    pagado = entrada.nextDouble();

    descuento = ((precio-pagado)/precio)*100;

    System.out.println("El descuento es del" + descuento + "%");

}

}
