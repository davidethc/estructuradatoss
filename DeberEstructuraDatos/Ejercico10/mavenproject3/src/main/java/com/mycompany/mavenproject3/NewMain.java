/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author monkyd
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de filas del avión:");
        int filas = scanner.nextInt();
        System.out.println("Ingrese el número de asientos por fila del avión:");
        int asientosPorFila = scanner.nextInt();

        Aerolinea aerolinea = new Aerolinea(filas, asientosPorFila);

        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Ver estado de los asientos");
            System.out.println("2. Reservar un asiento");
            System.out.println("3. Liberar un asiento");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opción:");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    aerolinea.mostrarEstadoAsientos();
                    break;
                case 2:
                    System.out.println("Ingrese el número de fila:");
                    int filaReserva = scanner.nextInt();
                    System.out.println("Ingrese el número de asiento:");
                    int asientoReserva = scanner.nextInt();
                    aerolinea.reservarAsiento(filaReserva, asientoReserva);
                    break;
                case 3:
                    System.out.println("Ingrese el número de fila:");
                    int filaLiberar = scanner.nextInt();
                    System.out.println("Ingrese el número de asiento:");
                    int asientoLiberar = scanner.nextInt();
                    aerolinea.liberarAsiento(filaLiberar, asientoLiberar);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }
        scanner.close();
    }
}
    
    

