/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monkyd
 */
public class NewClass {
    
}
public class Main {
    public static void main(String[] args) {
        int N = 5; // Tamaño de la matriz
        int[][] A = {{1, 2, 3, 4, 5},
                     {6, 7, 8, 9, 10},
                     {11, 12, 13, 14, 15},
                     {16, 17, 18, 19, 20},
                     {21, 22, 23, 24, 25}}; // Matriz de ejemplo
        
        // Calcular el N-ésimo número de la serie Fibonacci
        int K = fibonacci(N);
        
        // Multiplicar la matriz A por el escalar K
        int[][] R = multiplyMatrixByScalar(A, K);
        
        // Imprimir la matriz resultante R
        System.out.println("Matriz resultante:");
        printMatrix(R);
    }
    
    // Función para calcular el n-ésimo número de la serie Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    
    // Función para multiplicar una matriz por un escalar
    public static int[][] multiplyMatrixByScalar(int[][] A, int scalar) {
        int N = A.length;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = A[i][j] * scalar;
            }
        }
        return result;
    }
    
    // Función para imprimir una matriz
    public static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de la matriz: ");
        int N = scanner.nextInt();
        
        int[][] A = new int[N][N]; // Crear una matriz de tamaño N x N
        
        // Llenar la matriz con valores ingresados por el usuario
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        
        // Calcular el N-ésimo número de la serie Fibonacci
        int K = fibonacci(N);
        
        // Multiplicar la matriz A por el escalar K
        int[][] R = multiplyMatrixByScalar(A, K);
        
        // Imprimir la matriz resultante R
        System.out.println("Matriz resultante:");
        printMatrix(R);
        
        scanner.close();
    }
    
    // Función para calcular el n-ésimo número de la serie Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    
    // Función para multiplicar una matriz por un escalar
    public static int[][] multiplyMatrixByScalar(int[][] A, int scalar) {
        int N = A.length;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = A[i][j] * scalar;
            }
        }
        return result;
    }
    
    // Función para imprimir una matriz
    public static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class DiferenciaConjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el tamaño de los conjuntos A y B
        System.out.print("Ingrese el tamaño del conjunto A: ");
        int tamanoA = scanner.nextInt();
        int[] conjuntoA = new int[tamanoA];
        
        System.out.print("Ingrese el tamaño del conjunto B: ");
        int tamanoB = scanner.nextInt();
        int[] conjuntoB = new int[tamanoB];
        
        // Leer los elementos del conjunto A
        System.out.println("Ingrese los elementos del conjunto A:");
        for (int i = 0; i < tamanoA; i++) {
            conjuntoA[i] = scanner.nextInt();
        }
        
        // Leer los elementos del conjunto B
        System.out.println("Ingrese los elementos del conjunto B:");
        for (int i = 0; i < tamanoB; i++) {
            conjuntoB[i] = scanner.nextInt();
        }
        
        // Calcular la diferencia entre A y B
        int[] conjuntoC = diferenciaConjuntos(conjuntoA, conjuntoB);
        
        // Mostrar el conjunto resultado
        System.out.println("La diferencia A - B es:");
        for (int i = 0; i < conjuntoC.length; i++) {
            System.out.print(conjuntoC[i] + " ");
        }
    }
    
    // Método para calcular la diferencia entre dos conjuntos
    public static int[] diferenciaConjuntos(int[] conjuntoA, int[] conjuntoB) {
        // Suponemos que el tamaño máximo de C es la longitud de A
        int[] conjuntoC = new int[conjuntoA.length];
        int indiceC = 0;
        
        // Comprobar cada elemento de A
        for (int i = 0; i < conjuntoA.length; i++) {
            boolean encontrado = false;
            // Comprobar si el elemento está en B
            for (int j = 0; j < conjuntoB.length; j++) {
                if (conjuntoA[i] == conjuntoB[j]) {
                    encontrado = true;
                    break;
                }
            }
            // Si no está en B, añadirlo a C
            if (!encontrado) {
                conjuntoC[indiceC++] = conjuntoA[i];
            }
        }
        
        // Ajustar el tamaño de C al número de elementos encontrados
        int[] resultado = new int[indiceC];
        for (int i = 0; i < indiceC; i++) {
            resultado[i] = conjuntoC[i];
        }
        
        return resultado;
    }
}
