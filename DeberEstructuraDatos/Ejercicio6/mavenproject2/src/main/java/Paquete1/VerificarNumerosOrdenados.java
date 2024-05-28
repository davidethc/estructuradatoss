
package Paquete1;

public class VerificarNumerosOrdenados {

    public static void main(String[] args) {
        int []a={1,4,3,4,5};
        
        boolean b =ordenaraNumeros(a);
        System.out.println("Sus numeros estan ordenados?"+b);
        
        
        
       
    }
       public static boolean ordenaraNumeros(int []a){
        for(int i=0;i<a.length-1;i++)
            if(a[i]>a[i+1]){
                return false;
            }
             
            
           return true;
       }

 

}