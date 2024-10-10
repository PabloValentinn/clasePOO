package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        System.out.println("Probando clase CuentaBancaria");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial: " + c1.getSaldo());
        c1.deposita(10000);
        System.out.println("Saldo despues del 1er deposito "+ c1.getSaldo());
        double cr = 400;
        boolean rsn = c1.retira(cr);

        if (rsn) System.out.println("Retiraste " + cr + " te quedan "+ c1.getSaldo());
        else System.out.println("No tienes el saldo suficiente"); 

        System.out.println("\nProbando clase cliente");
        Cliente cliente1 = new Cliente("Juanito alcachofa", c1);
        System.out.println("Cliente 1 "+ cliente1);
        Cliente cliente2 = new Cliente("Brayan meza", new CuentaBancaria(1000));
        System.out.println(cliente2);
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);

        Cliente mujer = new Cliente("Sofia", cliente2.getCuenta());
        mujer.getCuenta().retira(10100);
        System.out.println(cliente2);


        System.out.println("\nProbando la clase banco");
        Banco miBanco = new Banco("Banco del bienestar", "Campus siglo xxi");
        miBanco.agregarCliente(cliente1);
        miBanco.agregarCliente(cliente2);
        miBanco.agregarCliente(mujer);
        miBanco.agregarCliente(new Cliente("Claudia", new CuentaBancaria(100000000)));
        miBanco.getClientes().get(3).getCuenta().retira(900000);
        miBanco.getClientes().get(0).getCuenta().deposita(30000);
        miBanco.getClientes().get(1).getCuenta().deposita(30000);
        miBanco.getClientes().get(2).getCuenta().deposita(30000);
        System.out.println("Los clientes del banco");
        double total = 0;
        for (Cliente cte : miBanco.getClientes()) {
            System.out.println(cte);
            total = total + cte.getCuenta().getSaldo();
            
        }

        System.out.printf("Totl del dinero en el banco %.2f", total);
    }
    
}
