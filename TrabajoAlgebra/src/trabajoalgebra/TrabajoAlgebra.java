/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoalgebra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TrabajoAlgebra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        boolean Salir = false;
        int opcion;
        System.out.println("Suma de matrices, producto de matrices, matriz inversa");
        System.out.println("");
        System.out.println("");
        while (!Salir) {
            System.out.println("1. Opcion 1: Suma de matrices");
            System.out.println("2. Opcion 2: Producto de matrices");
            System.out.println("3. Opcion 3: Matriz inversa");
            System.out.println("4. Opcion 4: Salir del menu");

            System.out.println("Elige un numero entre 1 - 4:   ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Elegiste suma de matrices");
                    int Matriz[][] = new int[3][3],Matriz2[][] = new int[3][3],Matriz3[][] = new int[3][3];

                    System.out.println("Ingresando los elementos de la primera matriz   ");
                    System.out.println("    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Ingrese numero en la posicion [" + i + "][" + j + "]:");
                            Matriz[i][j] = entrada.nextInt();
                        }
                    }
                    System.out.println("La primera matriz es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz[i][j] + "   ");

                        }
                        System.out.println();
                    }

                    System.out.println("       ");
                    System.out.println("Ingresando los elementos de la segunda matriz:   ");
                    System.out.println("     ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Ingrese numero en la posicion  [" + i + "][" + j + "]:");

                            Matriz2[i][j] = entrada.nextInt();

                        }

                    }
                    System.out.println("La segunda matriz es:  ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz2[i][j] + "  ");

                        }
                        System.out.println();

                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            Matriz3[i][j] = Matriz[i][j] + Matriz2[i][j];

                        }

                    }
                    System.out.println("     ");
                    System.out.println("La suma de las dos matrices es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz3[i][j] + "   ");
                        }
                        System.out.println();
                    }
                    System.out.println

("-----------------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Elegiste producto de matrices");
                    int Matriz5[][] = new int[3][3],
                     Matriz7[][] = new int[3][3],
                     multi[][] = new int[3][3];
                    ;
                    System.out.println("Ingresando elementos de la primera mattiz");
                    System.out.println("       ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Ingrese numero en la posicion [" + i + "][" + j + "]:");
                            Matriz5[i][j] = entrada.nextInt();

                        }
                    }
                    System.out.println("La primera matriz es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz5[i][j] + "   ");
                        }
                        System.out.println("");
                    }
                    System.out.println("      ");
                    System.out.println("Ingresando los elementos de la segunda matriz:     ");
                    System.out.println("       ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Ingrese numero en la posicion [" + i + "][" + j + "]:    ");
                            Matriz7[i][j] = entrada.nextInt();

                        }
                    }

                    System.out.println("La segunda matriz es:      ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz7[i][j] + "    ");

                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            for (int k = 0; k < 3; k++) {
                                multi[i][j] = multi[i][j] + (Matriz5[i][k] * Matriz7[k][j]);
                            }
                        }

                    }

                    System.out.println("");
                    System.out.println("Mostrando matriz");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("   " + multi[i][j] + "    ");
                        }
                        System.out.println();
                    }
                    System.out.println

("---------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("         Elegiste matriz inversa");
                    System.out.println("       ");
                    System.out.println("        ");

                    int Matriz10[][] = new int[3][3],
                     MatrizTransp[][] = new int[3][3];
                    System.out.println("Ingresando los elementos de la matriz   ");
                    System.out.println("       ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Ingrese numero en la posicion [" + i + "][" + j + "]:");
                            Matriz10[i][j] = entrada.nextInt();

                        }
                    }

                    System.out.println("La matriz es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz10[i][j] + " ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            MatrizTransp[i][j] = Matriz10[j][i];

                        }
                    }

                    System.out.println("La matriz inversa es:       ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(MatrizTransp[i][j] + "  ");
                        }
                        System.out.println("        ");

                    }
                    System.out.println

("-------------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Elegiste salir del menu");
                    Salir = true;
                    break;
                default:
                    System.out.println("Ingrese numeros entre 1 y 6");

            }
        }

        System.out.println("Fin del menú");
    }
    }
    

