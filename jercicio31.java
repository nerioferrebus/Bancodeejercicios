import java.util.Scanner;

public class jercicio31 {

    static Scanner entrada = new Scanner(System.in);
    static float militroBase, milimetroAltura, areacentimetro, areametro, areamilimetro;

    public static void main(String[] args) {
        
        System.out.println("Convertor de medidas triangulo");
        System.out.println("=======================================");

        System.out.println("Digite la base en milimetros");
        militroBase = entrada.nextFloat();

        System.out.println("Digite la altura en milimetros");
        milimetroAltura = entrada.nextFloat();


        areamilimetro = militroBase * milimetroAltura / 2;
         areacentimetro = areamilimetro / 100;
         areametro = areacentimetro / 100;


        System.out.println(" La base de el triangulo es :");
        System.out.println("En milimetros: " + areamilimetro);
        System.out.println("En centimetros: " + areacentimetro);
        System.out.println("Area metro: " + areametro);
       

        
        





    }

    
}
