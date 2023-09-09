import java.util.Scanner;

public class Ejercicio50 {

    static Scanner entrada = new Scanner(System.in);
    static double base, altura, area, perimetro;

    public static void main(String[] args) {
        
        System.out.println("Digite la base del rectangulo");
        base = entrada.nextDouble();

        System.out.println("Digite la altura del rectangulo");
        altura = entrada.nextDouble();

        area = base*altura;
        perimetro = base+base+altura+altura;

        System.out.println("El area de el rectangulo es :" + area);
        System.out.println("El perimetro de el rectangulo es: " + perimetro);

    }

}
