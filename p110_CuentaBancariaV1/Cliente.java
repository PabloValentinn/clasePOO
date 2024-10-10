package p110_CuentaBancariaV1;

public class Cliente {
    private String nombre;
    private CuentaBancaria cuenta;


    public Cliente(String nombre, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    @Override
    public String toString() {
        return "Cliente [Nombre=" + nombre + ", Cuenta=" + cuenta.getSaldo() + "]";
    }

    

    
    
}
