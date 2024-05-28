
package Paquete1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FuncionesMinisterio {
    
    
    public void MinisterioSalud(int p){
    Scanner sc = new Scanner (System.in);
        String textoPa = "Pacientes.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(textoPa)) ){
            
            for(int i =0;i<p;i++){
                System.out.println("Ingresando informacion del paciente "+(i+1));
                
                System.out.println("Cedula de identidad ");
                String cedula = sc.nextLine();
                 System.out.print("Apellidos Completos: ");
                String apellidos = sc.nextLine();

                System.out.print("Nombres Completos: ");
                String nombres = sc.nextLine();

                System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
                String fechaNacimiento = sc.nextLine();

                System.out.print("Estatura (cm): ");
                String estatura = sc.nextLine();

                System.out.print("Peso (kg): ");
                String peso = sc.nextLine();

                System.out.print("Alergias: ");
                String alergias = sc.nextLine();
                
                bw.write("Cedula de identidad: "+cedula+"\n");
                bw.write("Apellidos Completos: "+apellidos+"\n");
                bw.write("Nombres Completos: "+nombres+"\n");
                bw.write("Fecha de nacimiento: "+fechaNacimiento+"\n");
                bw.write("Estatura: "+estatura+"\n");
                bw.write("Peso: " + peso + "\n");
                bw.write("Alergias: " + alergias + "\n");
                bw.write("------------------------\n");
            
            }
                
            
        }catch(IOException e){
            System.out.println("OCURRIO UN ERROR AL ESCRIBIR EL ARCHIVO"+e.getMessage());
        }
        
        
        //leer y presentar la informacion de los pacientes
        System.out.println("\nInformacion de todos los paacientes");
        
        try (BufferedReader br = new BufferedReader(new FileReader(textoPa))){
            String linea ;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
            
            
            
            
        }catch(IOException e){
            
            System.out.println("Ocurrio un problema al leer el archivo "+ e.getMessage());
        }
       
        
        
    }
}
    