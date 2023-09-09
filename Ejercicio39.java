import java.util.Scanner;

public class Ejercicio39 {
    
    static Scanner entrada = new Scanner(System.in);
    static double klgoro, precioonza, miligramos, onzasingresadas, preciopagar;

    public static void main(String[] args) {
        
        System.out.println("Digite KG de oro");
        klgoro = entrada.nextDouble();

        System.out.println("Digite precio por onza de oro");
        precioonza = entrada.nextDouble();

        miligramos = klgoro*1000;
        onzasingresadas = miligramos/28.35;
        preciopagar = onzasingresadas*precioonza;

            System.out.println("Usted selecciono: " + klgoro + "kg: " + "de oro");
            System.out.println("Que son : " + onzasingresadas + " onzas");
            System.out.println("El valor por onza a pagar es de: " + precioonza );
            System.out.println("Debido a la cantidad ingresada usted debe cancelar el valor de: " + preciopagar);


    }

}
