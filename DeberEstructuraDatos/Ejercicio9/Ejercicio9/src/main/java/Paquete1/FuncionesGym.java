package Paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FuncionesGym {

    //Asistencia ramdom sobre los dias y los participantes
    public static boolean[][] generarAsistencia(int numC, int dia) {
        Random rd = new Random();

        boolean[][] asistencia = new boolean[numC][dia];
        for (int i = 0; i < numC; i++) {
            for (int j = 0; j < dia; j++) {
                asistencia[i][j] = rd.nextBoolean();
            }
        }

        return asistencia;
    }

    //mostrar asitencia
    public static void mostrarAsistencia(String[] p, boolean[][] a) {
        System.out.println("Asistencia de los clientes:");
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        for (int i = 0; i < p.length; i++) {
            System.out.println("Clientes numero " + (i + 1) + p[i]);
            for (int j = 0; j < 6; j++) {
                if (a[i][j]) {
                    System.out.print("Asistió (" + dias[j] + "), ");
                } else {
                    System.out.print("No Asistió (" + dias[j] + "), ");
                }
            }
            System.out.println();
        }
    }

    //obtener la lista con descuemto a los lientes q van mas de tres dias a la semana 
    public static List<String> obtenerClienteD(String[] clientes, boolean[][] a) {
        List<String> clientesConDescuento = new ArrayList<>();
        for (int i = 0; i < clientes.length; i++) {
            int contadorAsistencia = 0;
            for (int j = 0; j < 6; j++) {
                if (a[i][j]) {
                    contadorAsistencia++;
                }
            }
            if (contadorAsistencia >= 3) {
                clientesConDescuento.add(clientes[i]);
            }
        }
        return clientesConDescuento;
    }
}
