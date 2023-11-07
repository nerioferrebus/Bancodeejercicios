/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularmediamediana;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class CalcularMediaMediana {

    /**
     * @param args the command line arguments
  
  */
  
    public static double media (int A[]){
        Arrays.sort(A);
        int i;
        double media, suma = 0.0;
        for(i=0; i<A.length;i++){
         suma+= A[i];   
        }
        media= suma / A.length;
        return media;
    }
    
    public static double mediana (int A[]){
    Arrays.sort(A);
    double mediana;
    int mitad = A.length/2;
    
    if(A.length % 2==0){
        mediana = (A[mitad -1] + A[mitad])/2;
        
    }else{
        mediana = A [mitad];
    }
    return mitad;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = {1,2,3,4,5,6,7,8};
        
        System.out.println("La media es: " + media(A));
        System.out.println("La mediana es: " + mediana(A));
        
    }
    
}
