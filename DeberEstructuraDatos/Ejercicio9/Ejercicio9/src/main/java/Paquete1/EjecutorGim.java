
package Paquete1;

import java.util.List;

public class EjecutorGim {

    public static void main(String[] args) {
        
        String[] clientes = {"Juan","Ana","Maria","Elsa"};
        FuncionesGym fg = new FuncionesGym ();
        boolean [][] asistencia = fg.generarAsistencia(clientes.length,6);
      
        
        
     fg.mostrarAsistencia(clientes,asistencia);
    List<String>clientesConDescuento=fg.obtenerClienteD(clientes,asistencia)    ;
        
    // Mostrar clientes con descuento
        System.out.println("\nClientes con 20% de descuento por asistir al menos 3 días:");
        for (String cliente : clientesConDescuento) {
            System.out.println(cliente);
        }
    }
}