import java.util.Scanner;
public class Ejercicio29 {

    static Scanner entrada = new Scanner(System.in);    
    static int nro, nroalcubo;

    public static void main(String[] args) {
        
System.out.println("Digite un numero");
nro = entrada.nextInt();


nroalcubo = nro*nro*nro;

System.out.println("El numero ingresado: " + nro);
System.out.println("Al cubo es: " + nroalcubo);



    }

}
