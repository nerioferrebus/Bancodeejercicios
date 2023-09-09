import java.util.Scanner;

public class Ejercicio27 {

    static Scanner entrada = new Scanner(System.in);
    static String nombre, sexo; 

    public static void main(String[] args) {
        
        System.out.println("Digite su nombre");
        nombre = entrada.next();
        System.out.println("Eres hombre o mujer");
        sexo = entrada.next();

       switch (sexo) {
        case "hombre":

        System.out.println("Bienvenido");
            
            break;
       
        case "mujer":

        System.out.println("Bienvenida");

        break;

        default:

        System.out.println("Hola indeciso");

            break;
       }
        
        }

    }

