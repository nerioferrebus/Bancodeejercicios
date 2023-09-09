import java.util.Scanner;


public class Ejercicio32 {
    
static Scanner entrada = new Scanner(System.in);
static int nEmpleados, sexoEmpleados=0, empleadosVarones=0, empleadosMujeres=0, nominaMayor=0, totalempleados=0;
static double salariostotal, salarioEmpleados=0;

public static void main(String[] args) {

    System.out.println("Digite el numero de empleados");
    nEmpleados= entrada.nextInt();

    for (int i=0; i<nEmpleados; i++){

        System.out.println("Ingrese el sexo de el empleado M/F");
        char sexo = entrada.next().charAt(0);

        System.out.println("Ingrese el salario de el empleado");
        double salario = entrada.nextDouble();

        totalempleados++;
        salarioEmpleados+=salario;

        if (salario>700) {
            nominaMayor++;
          
            
        }
        
        if (sexo == 'F' || sexo == 'f') { 
            empleadosMujeres++;

            
        } else if (sexo == 'M' || sexo == 'm') {
            empleadosVarones++;
        } 
            
        }

        double porcentajeSalarios = salarioEmpleados/totalempleados;
        double porcentajeMujeres = (empleadosMujeres * 100.0) / totalempleados;
        double porcentajeVarones = (empleadosVarones * 100.0) / totalempleados;

        System.out.println("a) Cantidad de personas que ganan más de 700 al mes: " + nominaMayor);
        System.out.println("b) Promedio de salarios: " + porcentajeSalarios);
        System.out.println("c) Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("d) Porcentaje de varones: " + porcentajeVarones + "%");

    }
    




}



