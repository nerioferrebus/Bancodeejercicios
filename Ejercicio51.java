import java.util.Scanner;

public class Ejercicio51 {
    
static Scanner entrada = new Scanner(System.in);
static int nro, resultado;

public static void main(String[] args) {
    
System.out.println("Digite el numero q desea ver la tabla de multiplicar");
nro = entrada.nextInt();


for(int i=0; i<=10; i++){

    resultado = nro * i;


System.out.println(i + resultado);

}

}


}
