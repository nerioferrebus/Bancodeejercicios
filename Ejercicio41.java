import java.util.Scanner;

public class Ejercicio41 {
    
static Scanner entrada = new Scanner(System.in);
static double voltiosxnaranja = 0.5, kLvoltioxnaranja = voltiosxnaranja/1000, voltiosnecesarios;
static double naranjas, pesodenaranjas, tonelada, senecesitan;
public static void main(String[] args) {
    
System.out.println("Digite los voltios necesarios");
voltiosnecesarios = entrada.nextDouble();

naranjas = voltiosnecesarios/voltiosxnaranja;

System.out.println("Se necesitan: " + naranjas + " naranjas para" + voltiosnecesarios + " kilovoltios necesitados");

pesodenaranjas = 6.0;
tonelada = pesodenaranjas/1000000;
senecesitan = naranjas*tonelada;

System.out.println("Se requieren " + senecesitan + " toneladas para poderse realizar");




}

}
