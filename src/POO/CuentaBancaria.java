package POO;
public class CuentaBancaria {
    private final String titular;
    private double saldo;

    public  CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar( double cantidad){
        if (cantidad > 0)
            saldo += cantidad;
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo)
            saldo -= cantidad;
    }

    public void mostrarInfo(){
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }

    public boolean numerosRojos(){
        if(saldo < 0)
            return true;
        else
            return false;
    }
}
