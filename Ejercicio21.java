/*1. Leemos el valor de A 
  2. Leemos el valor de B
  3. Enseñamos por pantalla las variables declaradas
  4. Realizamos la ejecucion de el proceso
  5. Mostramos el resultado de el intercambio de las variables 
*/ 





import java.util.Scanner;

public class Ejercicio21 {
    
static Scanner entrada = new Scanner(System.in);
static int a, b, variar ;

public static void main(String[] args) {
    

System.out.println("Digite el valor de la valiable ´A´");
a = entrada.nextInt();

System.out.println("Digite el valor de la variable ´B´");
b = entrada.nextInt();

System.out.println("La variable A es: " + a );
System.out.println("La variable B es: " + b);

variar = a;
a = b;
b = variar;


System.out.println("Los valores intercambiados de A: " + a);
System.out.println("Los valores intercambiados de B: " + b);

}

}
//Importamos la clase Scanner para dar entrada para permitir la entrada de datos, declaramos como static int las variables a, b y variar, pedimos el valor de A por pantalla 
//y le damos entrada a la variable A y seguimos por igual con la siguiente variable que es la B  pidiendo su valor por pantalla y almacenandolo, despues procedemos a enseñar 
// los valores almacenados, por ultimo le damos el valor de A a la variable ¨variar¨, a la ´A´ le damos el valor de ´B´ y a la ´B´ le damos el valor de la variable variar
// para poder tener el resultado solicitado para culminar mostramos por pantalla los valores intercambiados 