package POO.banco;

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

    /**
     * GETs para todos los atributos Y SETs solo para los no criticos
     * @return e
     */
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
}
