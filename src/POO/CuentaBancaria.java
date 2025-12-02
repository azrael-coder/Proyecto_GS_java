package POO;
public class CuentaBancaria {
    private final String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }



    public void depositar( double cantidad){
        if (cantidad > 0)
            saldo += cantidad;
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && saldo >= cantidad)
            saldo -= cantidad;
    }

    public void mostrarInfo(){
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
        System.out.println("----------");
    }

    public boolean numerosRojos() {
        if (saldo < 0)
            return  true;
        else
            return false;

    }

    public void transferir (double cantidad, CuentaBancaria otraCuenta ){
        if (cantidad > 0 && saldo >= cantidad) {
            this.retirar(cantidad);
            otraCuenta.depositar(cantidad);
        }else
            System.out.println("Saldo insuficiente");
    }



}
