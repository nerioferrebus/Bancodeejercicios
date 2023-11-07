/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
/* Codigo debe recibir 10 datos 
 * calcular: Media, mediana, moda, cuartiles, Rango inter cuartil. 
 *desviacion estandar, coeficiente de variacion, coeficiente de asimetria.  
*/
static Scanner lector = new Scanner(System.in);
static double numero;
static double media;
static double varianza;
static double desviacion;
static double mediana;
static int n;
static double coVariacion;
static double coAsimetria;
static int moda; 



    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de numeros a calcular ");
        
        n=lector.nextInt();

        
        double numeros[]= new double[n];
       
        
        for(int i=0;i<n;i++){
            System.out.println("Ingrese un numero: ");
            numeros[i]=lector.nextDouble();

        }
        //calculo media
        
        double suma = 0;
        
        for (double i : numeros) {

            suma = suma+i;
            
        }

        media =suma/n;
        
        System.out.println("La media es: "+ media);

       
        //Calculo Varianza
        double sumatoria;
        for(int i=0;i<n;i++){
            sumatoria = Math.pow(numeros[i] - media,2);// esta funcion eleva lo que esta del lado izquierdo, al numero de la derecha 
            varianza = varianza + sumatoria;

        }
        varianza = varianza / (n-1);

       //calculo de la desviacion estandar
       
       desviacion = Math.sqrt(varianza);//esta funcion saca la raiz cuadrada el resultado obtenido en la varianza
       double redondeo = Math.rint(desviacion*100)/100;// esta funcion limita el numero de decimales 
       System.out.println("La desviacion estandar es: "+redondeo);

       //Calculo de mediana 
       
       Arrays.sort(numeros);  // si la cantidad de numeros es par
       if(n %2 == 0){
        int medio1=n/2;
        int medio2=medio1-1;

        mediana=(numeros[medio1]+numeros[medio2])/2.0;//formula para calcular el numero en la mitad

       }else{

        int medio= (n-1)/2;// si la cantidad de numeros es impar
        mediana=numeros[medio];

       }
       System.out.println("La mediana es: "+mediana);

       //calculo moda
     for(int i=0;i<n-1;i++){//se recorre dos veces el mismo arreglo para poder compararlos 
        for(int j=0;j<n-1;j++){
         int al=(int) numeros[i];
         int ba=(int) numeros[j];

         if(al==ba){//se comparan los numeros dentro del arreglo
            moda=(int) numeros[i];
       

          
         }

        }

       }
         System.out.println("La moda es: "+moda);
    // calculo Coeficiente de variacion 
    coVariacion = (varianza/media)*100;//esto es solo la formula S/Xpromedio*100
    System.out.println("El coeficiented de variacion es "+coVariacion);

    //Calculo coeficiente de asimetria 
  coAsimetria = ((media-mediana)*3)/redondeo;//redondeo es la desviacion estandar pero con el numero de decimales limitados

  System.out.println("El coeficiente de asimetria es: "+coAsimetria);

  // Calculo cuartiles 

  Arrays.sort(numeros);// esta funcion ordena los datos en el arreglo numeros en forma ascendente de - a +

  int Q1 = (int) Math.ceil(0.25*n)-1;//La funcion math.ceil aproxima siempre al proximo nuumero entero
  int Q3 = (int) Math.ceil(0.75*n)-1;

  double cuartil1=numeros[Q1];
  double cuartil2=mediana;
  double cuartil3=numeros[Q3];

  System.out.println("El Q1 es: "+cuartil1);
  System.out.println("El Q2 es: "+cuartil2);
  System.out.println("El Q3 es: "+cuartil3);

  //calculo rango inter cuartil
  double riq = cuartil3-cuartil1;
  System.out.println("El rango inter cuartil es: "+riq);


 
    } 
      
 
}
    /**
     * @param args the command line arguments
     */
  
    

