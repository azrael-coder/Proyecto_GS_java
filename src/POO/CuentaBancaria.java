package POO;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private final int numCuenta;

    CuentaBancaria (String titular, double saldoInicial, int numCuenta){
        this.titular = titular;
        this.numCuenta = numCuenta;

        if (saldoInicial > 0){
            this.saldo = saldoInicial;
        } else {
            System.out.println("Saldo invalido");
        }
    }

    public boolean depositar( double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }else{
            System.out.println("cantidad invalida");
            return false;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
        return true;
        }else {
            System.out.println("Se ha rechazado su retiro");
            return false;
        }
    }

    public void mostrarInfo(){
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("----------");
    }


    public boolean transferir (double cantidad, CuentaBancaria otraCuenta ){
        if (cantidad > 0 && saldo >= cantidad && otraCuenta != null) {
            this.retirar(cantidad);
            otraCuenta.depositar(cantidad);
            return true;
        }else
            System.out.println("Transferencia rechazada");
        return false;

    }
    //MOSTRAR SALDO
    public double getSaldo(){
        return saldo;
    }

    //MOSTRAT TITULAR
    public String getTitular(){
        return titular;
    }
    //MODFICAR EL TITULAR
    public void setTitular(String titular){
        this.titular = titular;
    }
    //MSTRAR EL NUMERO DE CUENTA
    public int getNumCuenta(){
        return numCuenta;
    }


}
