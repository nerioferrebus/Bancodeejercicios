import java.util.Scanner;

public class Ejercicio33 {
    
static Scanner entrada = new Scanner (System.in);
static double totalpagar, descuento, totalpagardescuento;

public static void main(String[] args) {
    
System.out.println("Digite el valor a pagar");
totalpagar = entrada.nextDouble();

if (totalpagar>1000) {
    descuento = 0.10;
    
} else if (totalpagar>500) {
    descuento = 0.20;
        
}

totalpagardescuento = totalpagar*descuento;
System.out.println("Monto total a pagar: " + totalpagar);
System.out.println("Con el descuento del: " + descuento*100 + "%");
System.out.println("El valor a pagar con el descuento es de: " + totalpagardescuento);
}

}
  