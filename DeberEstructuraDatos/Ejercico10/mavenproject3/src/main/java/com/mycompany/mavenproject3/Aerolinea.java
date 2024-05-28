/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author monkyd
 */
public class Aerolinea {
    
private char[][] asientos;

    // Constructor
    public Aerolinea(int filas, int asientosPorFila) {
        asientos = new char[filas][asientosPorFila];
        // Inicializar todos los asientos como vacíos ('O')
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < asientosPorFila; j++) {
                asientos[i][j] = 'O';
            }
        }
    }

    // Método para mostrar el estado actual de los asientos
    public void mostrarEstadoAsientos() {
        System.out.println("Estado actual de los asientos:");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para reservar un asiento
    public void reservarAsiento(int fila, int asiento) {
        if (asientos[fila - 1][asiento - 1] == 'O') {
            asientos[fila - 1][asiento - 1] = 'X'; // 'X' representa un asiento ocupado
            System.out.println("Asiento reservado exitosamente.");
        } else {
            System.out.println("El asiento seleccionado ya está ocupado.");
        }
    }

    // Método para liberar un asiento
    public void liberarAsiento(int fila, int asiento) {
        if (asientos[fila - 1][asiento - 1] == 'X') {
            asientos[fila - 1][asiento - 1] = 'O'; // 'O' representa un asiento vacío
            System.out.println("Asiento liberado exitosamente.");
        } else {
            System.out.println("El asiento seleccionado ya está vacío.");
        }
    }
}