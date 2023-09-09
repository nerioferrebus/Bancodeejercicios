import java.util.Scanner;

public class Ejercicio37 {
    
static Scanner entrada = new Scanner(System.in);
static int añosdevida, kgdefruta, kgdemanzana ;

public static void main(String[] args) {
    

    System.out.println("Cuantos años tienes");
    añosdevida = entrada.nextInt();

    kgdefruta = añosdevida*8;

    kgdemanzana = kgdefruta*1000/4;
    
    System.out.println("Tienes: " + añosdevida + "años de vida");
    System.out.println("Por lo tanto debes haber consumido: " + kgdefruta + "kg " + " de fruta ");
    System.out.println("Que serian al rededor de:  " + kgdemanzana + " manzanas: ");



}

}
