
package Paquete1;

import java.util.Arrays;


   public class RegistroCivil {
     //creo un objeto   
    private String[] cedulas;
    private int cantidadClientes;
        //Hago un constructor 
    public RegistroCivil(int capacidad) {
        cedulas = new String[capacidad];
        cantidadClientes = 0;
    }

    public void agregarCliente(String cedula) {
        if (cantidadClientes < cedulas.length) {
            cedulas[cantidadClientes++] = cedula;
            System.out.println("Cliente con cédula " + cedula + " ha sido agregado.");
        } else {
            System.out.println("No se pueden agregar más clientes. La cola está llena.");
        }
    }

    public void atenderCliente() {
        if (cantidadClientes > 0) {
            String clienteAtendido = cedulas[0];
            System.out.println("Cliente con cédula " + clienteAtendido + " ha sido atendido.");
            //aquie es donde ocuppo las colas
            
            
            // Mover todas las cédulas una posición a la izquierda
            for (int i = 0; i < cantidadClientes - 1; i++) {
                cedulas[i] = cedulas[i + 1];
            }
            cedulas[cantidadClientes - 1] = null; // Vaciar el último índice
            cantidadClientes--;
        } else {
            System.out.println("No hay clientes que atender.");
        }
    }

    public void retirarseDeLaCola(String cedula) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadClientes; i++) {
            if (cedulas[i].equals(cedula)) {
                encontrado = true;
                System.out.println("Cliente con cédula " + cedula + " se ha retirado de la cola.");
                // Mover todas las cédulas a la derecha del cliente retirado una posición a la izquierda
                for (int j = i; j < cantidadClientes - 1; j++) {
                    cedulas[j] = cedulas[j + 1];
                }
                cedulas[cantidadClientes - 1] = null; // Vaciar el último índice
                cantidadClientes--;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente con cédula " + cedula + " no encontrado en la cola.");
        }
    }

    public void mostrarCola() {
        System.out.println("Cola de clientes:");
        System.out.println(Arrays.toString(cedulas));
    }
 
   }
