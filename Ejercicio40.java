import java.util.Scanner;
public class Ejercicio40 {
    
static Scanner entrada = new Scanner(System.in);
static int añosdenaciomiento,  mesesnacido;
static double cmCrecido;
public static void main(String[] args) {
    
System.out.println("Digite cuantos años tiene");
añosdenaciomiento= entrada.nextInt();

mesesnacido = añosdenaciomiento*12;
cmCrecido = mesesnacido*0.5;

System.out.println("Segun los datos ingresados tienes " + mesesnacido + " meses viviendo");
System.out.println("Por cada mes el pelo crece medio centimetro");
System.out.println("Entonces tienes: " + cmCrecido + "cm: " + "de pelo");




}


}
