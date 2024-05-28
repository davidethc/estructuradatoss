
package Paquete1;

import java.util.Scanner;


public class Ejecutor {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de pacientes que se van a registrar: ");
        int cantidadPacientes = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea nueva
        
       FuncionesMinisterio fm = new FuncionesMinisterio();
       
       fm.MinisterioSalud(cantidadPacientes);
        System.out.println(fm);
    }
    
}
