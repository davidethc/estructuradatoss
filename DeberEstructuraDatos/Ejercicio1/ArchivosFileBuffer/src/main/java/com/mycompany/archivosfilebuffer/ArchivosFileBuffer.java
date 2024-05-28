package com.mycompany.archivosfilebuffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosFileBuffer {

    public static void main(String[] args) {

        String leeArchivo = "/Users/monkyd/Desktop/DeberEstructuraDatos/Ejercicio1/Deudas.txt";
        String leeArchivo2 = "/Users/monkyd/Desktop/DeberEstructuraDatos/Ejercicio1/DeudasActualiza.txt";

        try (FileReader fd = new FileReader(leeArchivo);
                BufferedReader bf = new BufferedReader(fd); 
                FileWriter fw = new FileWriter(leeArchivo2); 
                BufferedWriter bw = new BufferedWriter(fw)) {
            

            String linea;
            while ((linea = bf.readLine()) != null) {
                // Se rempplaza la central de riesgo con el metodo 
                String remplazaTexto = linea.replace("Central de Riesgo", "Liberado");
                bw.write(remplazaTexto);
                bw.newLine();

            }
        } catch (IOException e) {
            System.out.println("Se produjo un error al leer el archivo: " + e.getMessage());

        }
    }
}
