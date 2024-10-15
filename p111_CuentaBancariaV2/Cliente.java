package p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<CuentaBancaria> cuentas;
    
    public Cliente(){
        cuentas = new ArrayList<>();
    }
    public Cliente(String nombre){
        this();
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarCuenta(CuentaBancaria cuenta){
        cuentas.add(cuenta);
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }
    public double getTotal(){
        double total=0;
        for(CuentaBancaria cuenta : cuentas){
            total += cuenta.getSaldo();
        }
        return total;
    }
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", cuentas=" + cuentas.size() + ", Total=" + this.getTotal() + "]";
    }
}