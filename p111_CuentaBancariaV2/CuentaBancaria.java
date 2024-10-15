package p111_CuentaBancariaV2;

public abstract class CuentaBancaria { 

    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    public void deposita(double cantidad) {
        saldo = saldo + cantidad;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public abstract boolean retira(double cantidad);
}