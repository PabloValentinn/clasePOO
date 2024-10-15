package p111_CuentaBancariaV2;

public class CuentaDeCheques extends CuentaBancaria {
    private double sobregiro;

    public CuentaDeCheques(double saldo, double sobregiro){
    super(saldo);
    this.sobregiro = sobregiro;
    }   

    public boolean retira(double cantidad){
        if(saldo >= cantidad){
            saldo -= cantidad;
        } else{ 
            double requerida = cantidad - saldo;
            if(sobregiro>=requerida){
                saldo=0;
                sobregiro += requerida;
            }else return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CuentaDeCheques [" + super.getSaldo() + ", sobregiro=" + sobregiro + "]";
    }
    
}