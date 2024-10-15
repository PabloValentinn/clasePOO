package p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria {

    private double tasainteres;

    public CuentaDeAhorro(double saldo, double tasainteres){ 
        super(saldo);
        this.tasainteres = tasainteres;
    }
    
    public void calcularInteres(){
        saldo += saldo * tasainteres;
    }
    public boolean retira(double cantidad){
        if(saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro [saldo=" + getSaldo() + ", tasainteres=" + tasainteres + "]";
    }
    
}