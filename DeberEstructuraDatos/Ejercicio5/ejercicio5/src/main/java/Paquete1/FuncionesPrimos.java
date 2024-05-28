
package Paquete1;

public class FuncionesPrimos {
    public boolean primo(int num){
 
     for(int i=2;i<num;i++){
         if(num%i==0){
             return false;
         }
         }
            return true; 
     }
    public void llenarPrimos(int[]a){
        int num=2;
        for (int contador=0;contador<a.length;){
            if(primo(num)){
              a[contador]=num;
              contador++;
            }
            num++;
        }
    }
     
    }

