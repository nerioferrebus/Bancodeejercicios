import java.util.Scanner;

public class Ejercicio25 {
    
static Scanner entrada = new Scanner(System.in);
static double gCentigrados, gFarenheit;

public static void main(String[] args) {
    
System.out.println("Convertor de grados centigrados a grados farenheit");
System.out.println("=======================================================");
System.out.println("Digite los grados centigrados a convertir");

gCentigrados = entrada.nextDouble();

gFarenheit = gCentigrados*9/5+32;

System.out.println("Los grados centigrados ingresados: " + gCentigrados);
System.out.println("Son estos grados farenheit: " + gFarenheit);


}

}
