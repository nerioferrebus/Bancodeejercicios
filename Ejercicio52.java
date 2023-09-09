import java.util.Scanner;

public class Ejercicio52 {
    
static Scanner entrada = new Scanner(System.in);
static float Pl, Sl, area;

public static void main(String[] args) {
    
    System.out.println("Calculemos el area de un cuadrado");
    System.out.println("Digite las medidas de ambos lados");
    System.out.println("Primer lado");
    Pl = entrada.nextFloat();
    System.out.println("Segundo lado");
    Sl = entrada.nextFloat();

    area = Pl*Sl;

    System.out.println(" El area de este cuadrado es: " + area);
}

}
