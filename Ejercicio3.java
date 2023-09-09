/* 
1. Importamos Scanner 
2. Le damos entrada a las variables base, altura y area
3. Pediimos el valor por pantalla de las variables base y altura
4. Realizamos la operacion area = base por altura dividido entre dos 
5. Mostramos el resultado
*/ 

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner entrada = new Scanner(System.in);
    static int base, altura, area;

    public static void main(String[] args) {

        System.out.println(" Programa para medir el area de un triangulo ");
        System.out.println("==============================================");

        System.out.println("DIGITE LA BASE");
        base = entrada.nextInt();

        System.out.println("DIGITE LA ALTURA");
        altura = entrada.nextInt();

        area = base*altura/2;

        System.out.println("El area de este triangulo es: " + area );



        
    }
}


/* importamos la Scanner para darle entrada a lo ingresado por el usuario y declaramos la variable String apellido. Ingresamos el metodo main y pedimos el apellido al usuario por pantalla
dandole entrada a traves de el Scanner, y declaramos las variables que vamos a utilizar base, altura y area, entramos al metodo main y pedimos la base y la altura por pantalla
y realizamos la operacion el area de un triangulo es igual a la base por la altura dividido entre dos, enseñamos el resultado por pantalla                                                                                                                                                                                                                                                                                                                             
 */