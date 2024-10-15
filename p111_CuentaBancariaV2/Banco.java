package p111_CuentaBancariaV2;

import java.util.ArrayList;
public class Banco {
    private String nombre;
    private String Domicilio;
    private ArrayList<Cliente> clientes;
    public Banco(){
        clientes = new ArrayList<>();
    }
    public Banco(String nombre, String domicilio) {
        this();
        this.nombre = nombre;
        this.Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    public double getTotal(){
        double total=0;
        for (Cliente cliente : clientes){
            total += cliente.getTotal();
        }
        return total;
    }
    public void CalcularInteres(){
        for (Cliente cliente : clientes){
            for(CuentaBancaria cuenta : cliente.getCuentas()){
                if(cuenta instanceof CuentaDeAhorro){
                    ((CuentaDeAhorro)cuenta).calcularInteres();
                }
            }
        }
    }
    public String getNombre() {
        return nombre;
    }
    public String getDomicilio() {
        return Domicilio;
    }
    public void reporte(){
        for (Cliente cliente : clientes){
            System.out.println("> " + cliente);
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                System.out.println(cuenta.toString());
            }
            if (cliente.getCuentas().size()==0) System.out.println();
        }
    }
    @Override
    public String toString() {
        return "\nBanco [nombre=" + nombre + ", Domicilio=" + Domicilio + ", clientes=" + clientes.size() + ", Total()="
                + this.getTotal() + "]";
    }
    
}