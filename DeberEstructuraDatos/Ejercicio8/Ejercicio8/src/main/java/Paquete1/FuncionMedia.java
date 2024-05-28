
package Paquete1;
public class FuncionMedia {
    // Media de cada alumno
    public static double mediaAlumno(int[] alumnoNotas) {
        double suma = 0;
        for (int i = 0; i < alumnoNotas.length; i++) {
            suma += alumnoNotas[i];
        }
        return suma / alumnoNotas.length;
    }

    // Media de cada asignatura
    public static double mediaAsignatura(int[][] alumnosNotas, int asignatura) {
        double suma = 0;
        for (int i = 0; i < alumnosNotas.length; i++) {
            suma += alumnosNotas[i][asignatura];
        }
        return suma / alumnosNotas.length;
    }

    // Media de toda la clase
    public static double mediaClase(int[][] alumnosNotas) {
        double suma = 0;
        for (int i = 0; i < alumnosNotas.length; i++) {
            for (int j = 0; j < alumnosNotas[i].length; j++) {
                suma += alumnosNotas[i][j];
            }
        }
        return suma / (alumnosNotas.length * alumnosNotas[0].length);
    }
}