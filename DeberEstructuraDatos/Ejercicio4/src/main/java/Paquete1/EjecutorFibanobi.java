
package Paquete1;

public class EjecutorFibanobi {

    public static void main(String[] args) {
           //serieFibanobi
         int [] tamano = new int[10];  
               
        // Crear una instancia de la clase para llamar al método no estático
        EjecutorFibanobi ejecutor = new EjecutorFibanobi();
        
        // Llenar el arreglo con los números de Fibonacci
        ejecutor.fibanobi(tamano);
        
        // Imprimir el arreglo para verificar los números de Fibonacci
        for (int i : tamano) {
            System.out.print(i + " "); 
          
    }
    }
    
    public void fibanobi(int []tamano){
        for (int i =0;i<tamano.length;i++){
            tamano[i]=fibannobiRecursivo(i);
        }
    }
    
    public int fibannobiRecursivo(int n){
        if (n<=1){
            return 1; 
        }else{
            return fibannobiRecursivo(n-1)+fibannobiRecursivo(n-2);
        }
    }
    
}
