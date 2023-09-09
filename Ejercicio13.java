import java.util.Scanner;

public class Ejercicio13 {
    
static Scanner entrada = new Scanner(System.in);
static int n1, n2, n3, ult_nro1,ult_nro2,ult_nro3;

public static void main(String[] args) {
    
System.out.println("Digite el primer numero");
n1=entrada.nextInt();

System.out.println("Digite el segundo numero");
n2=entrada.nextInt();

System.out.println("Digite el tercer numero");
n3=entrada.nextInt();

ult_nro1 = n1%10;
ult_nro2 = n2%10;
ult_nro3 = n3%10;


System.out.println("El ultimo numero de: " + n1 + " es: " + ult_nro1);
System.out.println("El ultimo numero de: " + n2 + " es: " + ult_nro2);
System.out.println("El ultimo numero de: " + n3 + " es: " + ult_nro3 );

}



}
