package POO;
import java.util.Scanner;

/*CLASE PARA MODELAR LAS CUENTAS*/
public class CuentaBancaria {
    private String titular;
    private double saldo;
    private  int numCuenta;

    CuentaBancaria (String titular, double saldoInicial, int numCuenta) {
        this.titular = titular;

        if (saldoInicial > 0)
            this.saldo = saldoInicial;

        if (numCuenta <= 0)
            this.numCuenta = numCuenta;
    }


    boolean depositar(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }else{
            System.out.println("cantidad invalida");
            return false;
        }
    }


    boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
        return true;
        }else {
            System.out.println("Se ha rechazado su retiro");
            return false;
        }
    }

    /**
     * Muestra la informacion de las cuentas bancarias
     */
    void mostrarInfo(){
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
    boolean transferir (double cantidad, CuentaBancaria otraCuenta ){
        if (cantidad > 0 && saldo >= cantidad && otraCuenta != null) {
            this.retirar(cantidad);
            otraCuenta.depositar(cantidad);
            return true;
        }else
            System.out.println("Transferencia rechazada");
        return false;

    }


    /**
     * GETs para todos los atributos Y SETs solo para los no criticos
     * @return
     */
    double getSaldo(){
        return saldo;
    }


    String getTitular(){
        return titular;
    }


    void setTitular(String titular){
        if (titular != "") {
            this.titular = titular;
            System.out.println("ok");
        }else
            System.out.println("NOMBRE INVALIDO");
    }


    int getNumCuenta(){
        return numCuenta;
    }


}
