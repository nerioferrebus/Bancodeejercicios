import java.util.Scanner;
public class Ejercicio38 {
    
    static Scanner entrada = new Scanner(System.in);
    static String nombre;
    static int añosdevida1,añosdevida2, fechanacido, añoactual=2023;
    static double diasdormidos;
    public static void main(String[] args) {
        
        System.out.println("Digite su nombre");
        nombre = entrada.nextLine();

        System.out.println("Digite su fecha de nacimiento");
        fechanacido= entrada.nextInt();

        añosdevida1 = añoactual-fechanacido;
        añosdevida2 = añosdevida1*365;
        diasdormidos= añosdevida2*0.34;

        System.out.println("Hola: " + nombre + "¿como estas?");
        System.out.println("Tienes: " + añosdevida1 + "años de vida");
        System.out.println("Duermes el 34% de tu vida tenemos entendido");
        System.out.println( "Con los datos que nos has compartido podemos entender que duermes: " + diasdormidos + " dias al año");

    }
}
