import java.util.Scanner;
public class Ejercicio28 {

    static Scanner entrada = new Scanner(System.in);
    static int nro;

    public static void main(String[] args) throws InterruptedException{
        System.out.println("ingrese numero");
        nro=entrada.nextInt();
        
        
        

        for(int i=nro; i>0; i--){
            Thread.sleep(1000);

            System.out.println("El contador es igual a: " + i);
      
                        
        }
        System.out.println("Tiempo agotado");
        Thread.sleep(2000);
            System.out.println("El conteo ha sido exitoso");


    }
    
}
