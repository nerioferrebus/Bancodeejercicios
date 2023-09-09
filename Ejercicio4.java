import java.util.Scanner;
public class Ejercicio4 {

    static Scanner entrada = new Scanner(System.in);
    static double radio, area;

    public static void main(String[] args) {
        
        System.out.println("Digite el radio del circulo");
        radio = entrada.nextInt();

       radio = radio*radio;
       area = radio*3.1416;

       System.out.println("El area de este circulo es de: " + area);
    }
    
}
