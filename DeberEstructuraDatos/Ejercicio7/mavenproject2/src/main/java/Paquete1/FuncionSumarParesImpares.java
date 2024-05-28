
package Paquete1;


public class FuncionSumarParesImpares {
    public static int  sumaPares(int[]a){
       int sumPares=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
            sumPares=sumPares+a[i];
            }else{
                
            }
            
        }
        return sumPares;
    }
        public static int sumaImpares(int[]a){
       int sumImpares=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
            sumImpares=sumImpares+a[i];
            }else{
                
            }
        }
        return sumImpares;
    }
}
