package Paquete1;

import java.util.Random;

public class Ejercicio8 {

    public static void main(String[] args) {
 int alumnos = 20;
        int notas = 4;
        Random ran = new Random();
        int[][] alumnosNotas = new int[alumnos][notas];
        System.out.println("Estudiantes");
        for (int i = 0; i < alumnosNotas.length; i++) {
            System.out.println("Estudiante: " + (i + 1));
            for (int j = 0; j < notas; j++) {
                alumnosNotas[i][j] = ran.nextInt(11);
            }
            double mediaAlumno = FuncionMedia.mediaAlumno(alumnosNotas[i]);
            System.out.println("Media del Estudiante " + (i + 1) + ": " + mediaAlumno);
        }

        // Calcular y mostrar la media de cada asignatura
        System.out.println("\nMedia de cada asignatura:");
        for (int j = 0; j < notas; j++) {
            double media = FuncionMedia.mediaAsignatura(alumnosNotas, j);
            System.out.println("Asignatura " + (j + 1) + ": " + media);
        }

        // Calcular y mostrar la media de toda la clase
        double mediaClase = FuncionMedia.mediaClase(alumnosNotas);
        System.out.println("\nMedia de toda la clase: " + mediaClase);
    }
}