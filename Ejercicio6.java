import java.util.Scanner;

public class Ejercicio6 {
    static Scanner entrada = new Scanner(System.in);
    static double n1, n2, n3, med_total, suma;

    public static void main(String[] args) {
        
        System.out.println("Media aritmetica de tres numeros");
        System.out.println("====================================");
        

        System.out.println("Digite el primer numero");
        n1 = entrada.nextDouble();

        System.out.println("Digite el segundo numero");
        n2 = entrada.nextDouble();

        System.out.println("Digite el tercer numero");
        n3 = entrada.nextDouble();

        suma = n1+n2+n3;

        med_total = suma/3;

        System.out.println("La media aritmetica de estos numeros es : " + med_total);

    }
}
