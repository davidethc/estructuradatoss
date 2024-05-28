package Paquete1;

import java.util.Scanner;

public class FuncionFactorial {

    public int CalcularFactorial(int n) {
        if (n > 0) {
            return n * CalcularFactorial(n - 1);
        }
        return 1;
    }

    // Método para llenar el arreglo con los números ingresados por el usuario
    public void llenarArreglo(int[] tamañoArreglo) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tamañoArreglo.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + " para calcular su factorial:");
            tamañoArreglo[i] = sc.nextInt();
        }
    }

    // Método para calcular los factoriales y almacenarlos en el arreglo B
    public void CalcularFac(int[] a, int[] b) {
        for (int j = 0; j < a.length; j++) {
            b[j] = CalcularFactorial(a[j]);
        }
    }

    // Método para imprimir los factoriales almacenados en el arreglo B
    public void imprimirFactorial(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println("El factorial del número " + (i + 1) + " es: " + b[i]);
        }
    }
}