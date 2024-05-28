
package Paquete1;

public class PilasColasEjecutor {

    public static void main(String[] args) {
RegistroCivil registro = new RegistroCivil(5); 
        registro.agregarCliente("123456");
        registro.agregarCliente("654321");
        registro.mostrarCola();
        registro.atenderCliente();
        registro.mostrarCola();
        registro.retirarseDeLaCola("654321");
        registro.mostrarCola();
    }
}
    

