/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Paquete1;

import java.util.Random;

/**
 *
 * @author monkyd
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int N = 5; // Tamaño de la matriz cuadrada
        int[][] matriz = generarMatriz(N);
        
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        transponerSobreDiagonalSecundaria(matriz);
        
        System.out.println("Matriz transpuesta sobre la diagonal secundaria:");
        mostrarMatriz(matriz);
    }
    
    // Método para generar una matriz cuadrada de tamaño NxN con números aleatorios entre 1 y 99
    public static int[][] generarMatriz(int N) {
        int[][] matriz = new int[N][N];
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = rand.nextInt(99) + 1;
            }
        }
        return matriz;
    }
    
    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        int N = matriz.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Método para transponer una matriz sobre la diagonal secundaria
    public static void transponerSobreDiagonalSecundaria(int[][] matriz) {
        int N = matriz.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                // Intercambiar elementos simétricos respecto a la diagonal secundaria
                int temp = matriz[i][j];
                matriz[i][j] = matriz[N - j - 1][N - i - 1];
                matriz[N - j - 1][N - i - 1] = temp;
            }
        }
    }
}