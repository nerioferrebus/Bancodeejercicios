import java.util.Scanner;

public class Ejercicio24 {
    
static Scanner entrada = new Scanner(System.in);
static double pulgadas, centimetros;

public static void main(String[] args) {
    

    System.out.println("Convertor de pulgadas a centimentros");
    System.out.println("=========================================");

    System.out.println("Digite las pulgadas que quiere convertir ");
    pulgadas = entrada.nextDouble();

    centimetros = pulgadas*2.54;

    System.out.println("Las siguientes pulgadas que fueron ingresadas: " + pulgadas);
    System.out.println("Tienen una medicion en centimentros de : " + centimetros);


}

}
