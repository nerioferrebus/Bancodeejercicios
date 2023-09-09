import java.util.Scanner;

public class Ejercicio43 {
    
static Scanner entrada = new Scanner(System.in);

public static void main(String[] args) {
    double nropi = Math.PI;
    
    for (int exponente = 2; exponente <= 10; exponente++) {
        double potencia = Math.pow(nropi, exponente);
        double raizCuadrada = Math.sqrt(potencia);
        
        System.out.println("Para el exponente " + exponente + ":");
        System.out.println("Potencia de PI: " + potencia);
        System.out.println("Raíz cuadrada de la potencia: " + raizCuadrada);
        System.out.println();

}
}
}