
package Paquete1;

import java.util.Scanner;


public class EjecutorFactorial {

   
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del arreglo (debe ser 10):");
        int ta =10;
        FuncionFactorial fc = new FuncionFactorial();
        int[] arrA = new int[ta];
        int[] arrB = new int[ta];

        fc.llenarArreglo(arrA);
        fc.CalcularFac(arrA, arrB);
        fc.imprimirFactorial(arrB);
    }
}