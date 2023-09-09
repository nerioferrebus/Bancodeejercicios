import java.util.Scanner;

public class Ejercicio16 {
    
static Scanner entrada = new Scanner(System.in);
static double nota_parcial;

public static void main(String[] args) {
    
    System.out.println("Digite nota dee su parcial");
    nota_parcial = entrada.nextDouble();

    if (nota_parcial>=3) {

        System.out.println("Aprobaste el parcial");
        
    } else {

        System.out.println("Reprobaste el parcial");
        
    }


}

}
