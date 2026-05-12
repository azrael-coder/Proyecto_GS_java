package POO.banco;
import java.util.Scanner;

/*CLASE PARA GESTIONAR LAS CUENTAS (registro, busquedas, etc)*/
public class GestorCuentas {

    void registro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su titular: ");
        String titular = sc.nextLine();

        System.out.println("Ingrese su saldo: ");
        double saldo = sc.nextDouble();
        while (saldo < 0){
            System.out.println("Saldo invalido, introduzca otro: ");
            saldo = sc.nextDouble();
        }

        System.out.println("Ingrese su numero de cuenta: ");
        int numCuenta = sc.nextInt();
        while (numCuenta < 0){
            System.out.println("Numero invalido, introduzca otro: ");
            numCuenta = sc.nextInt();
        }


        CuentaBancaria Cuenta = new CuentaBancaria(titular, saldo, numCuenta);

        System.out.println("Cuenta registrada correctamente");
    }

    boolean depositar(CuentaBancaria cuenta, double cantidad){
        boolean depositado = false;
        if (cantidad > 0) {
             cuenta.setSaldo(cuenta.getSaldo() + cantidad);
            depositado = true;
        }
        return depositado;
    }


    boolean retirar(CuentaBancaria cuenta,double cantidad) {
        if (cantidad > 0 && cuenta.getSaldo() >= cantidad){
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
            return true;
        }else {
            return false;
        }
    }

    /*


    public String mostrarInfo(){
        String resultado = "";

        resutlado
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("----------");
    }


    /**
     * Transferencias entre cuentas
     * @param cantidad es validado antes de ejecutarse
     * @param otraCuenta otro objeto como parametro
     * @return true o false dependendiendo si falla o es exitosa
     */
    /*
    boolean transferir (double cantidad, CuentaBancaria otraCuenta ){
        if (cantidad > 0 && saldo >= cantidad && otraCuenta != null) {
            this.retirar(cantidad);
            otraCuenta.depositar(cantidad);
            return true;
        }else
            System.out.println("Transferencia rechazada");
        return false;

    }
     */


}

