import java.util.Scanner;

public class Ejercicio14 {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite un numero de 4 digitos");
        int nro = entrada.nextInt();
        int suma = Integer.toString(nro).length();
        int total =  0;

        if (nro>=4) {

           for(int i=0;i<suma;i++){
             String num = String.valueOf(Integer.toString(nro).charAt(i)) ;
             total = Integer.parseInt(num) ;

           }
            
           System.out.println("La suma de los digitos de este numero: " + nro + "es de: " + total);

        } else {
            System.out.println("El numero no puede ser procesado");
        }

    }

}
