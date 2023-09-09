import java.util.Scanner;
public class Ejercicio54 {
    
static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
       
        System.out.println("Digite numero");
        Object valor = entrada.nextInt(); 
        int resultado = esNro(valor);
        System.out.println("El resultado es " + resultado);


    }
    public static int esNro(Object valor) {
        try {
            Double.parseDouble(valor.toString());
            return 1; // Es un número
        } catch (NumberFormatException e) {
            return 0; // No es un número
        }
    }
}

