
package Paquete1;

public class EjecutorSumaParesImpares {

    public static void main(String[] args) {
        int []b={1,2,3,4,5,6};
            FuncionSumarParesImpares fp = new   FuncionSumarParesImpares();
        int sumP = fp.sumaPares(b);
        int sumI = fp.sumaImpares(b);
     
          System.out.println("Suma de pares: " + sumP);
          System.out.println("Suma Impares "+sumI);
    }
}
