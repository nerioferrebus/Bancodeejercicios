/*
 1.Leemos apellido 
 2. Le damos entrada
 3. Mostramos por pantalla el apellido ingresado
 */

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner entrada = new Scanner(System.in);    
    static String apellido;
public static void main(String[] args) {

    System.out.println("Digite su apellido");
    apellido = entrada.nextLine();

    System.out.println("Su apellido es " + apellido);

}

}

/* importamos la Scanner para darle entrada a lo ingresado por el usuario y declaramos la variable String apellido. Ingresamos el metodo main y pedimos el apellido al usuario por pantalla
dandole entrada a traves de el Scanner, para culminar le enseñamos al usuario que su apellido fue ingresado
  

 */