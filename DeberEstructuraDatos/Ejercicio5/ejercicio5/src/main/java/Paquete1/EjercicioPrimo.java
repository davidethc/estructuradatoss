

package Paquete1;


public class EjercicioPrimo {

    public static void main(String[] args) {
       
   int[ ]arr=new int[10];
   FuncionesPrimos fp = new FuncionesPrimos();

   
   fp.llenarPrimos(arr);
   
       
    System.out.println("Arreglo de los primeros 10  "  + " números primos:");
        for (int primo : arr) {
            System.out.print(primo + " ");
        }
    }
}


    


