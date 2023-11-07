package estadisticaproyecto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstadisticaProyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar los números
        double[] numeros = new double[10];

        // Leer los números desde el usuario
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular la media
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        double media = suma / 10;

        // Calcular la mediana
        Arrays.sort(numeros);
        double mediana;
        if (numeros.length % 2 == 0) {
            int medio1 = numeros.length / 2 - 1;
            int medio2 = numeros.length / 2;
            mediana = (numeros[medio1] + numeros[medio2]) / 2;
        } else {
            int medio = numeros.length / 2;
            mediana = numeros[medio];
        }

        // Calcular la moda
        Map<Double, Integer> conteo = new HashMap<>();
        for (double numero : numeros) {
            conteo.put(numero, conteo.getOrDefault(numero, 0) + 1);
        }
        double moda = numeros[0];
        int maxFrecuencia = 1;
        for (Map.Entry<Double, Integer> entry : conteo.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }

        // Calcular cuartiles
        double q1 = calcularCuartil(numeros, 0.25);
        double q2 = mediana;  // Cuartil 2 es igual a la mediana
        double q3 = calcularCuartil(numeros, 0.75);

        // Mostrar los resultados
        System.out.println("Media: " + media);
        System.out.println("Mediana: " + mediana);
        System.out.println("Moda: " + moda);
        System.out.println("Cuartil 1 (Q1): " + q1);
        System.out.println("Cuartil 2 (Q2, mediana): " + q2);
        System.out.println("Cuartil 3 (Q3): " + q3);

        scanner.close();
    }

    // Función para calcular el cuartil dado un arreglo de números y una posición (p)
    public static double calcularCuartil(double[] numeros, double p) {
        Arrays.sort(numeros);
        int n = numeros.length;
        int k = (int) (p * (n - 1));
        double d = (p * (n - 1)) - k;
        return numeros[k] + d * (numeros[k + 1] - numeros[k]);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
