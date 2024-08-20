// p17_TrabajandoFlotantes - Trabajando coon numeros y literales de tipo flotante

public class p17_TrabajandoFlotantes {
    public static void main(String[] args) {
        float num1 = 423.45f;
        float num2 = 123f;
        float num3 = 1.94e-8f;

        double num4 = 1232312321.424242d;
        double num5 = .3456;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nUso de String.format parra formateo de numeros flotantes: ");
        System.out.println(String.format("num1 y num2 en formato flotante: %f - %f", num1, num2));
        System.out.println(String.format("num1 y num2 en formato flotante con decimales: %.2f - %,3f", num1, num2));
        System.out.println(String.format("num1 en formato flotante alineado:  %10.2f", num1));
        System.out.println(String.format("num2 en formato flotante alineado:  %10.2f", num2));
        System.out.println(String.format("num3 en formato exponencial:  %e", num3));
        System.out.println(String.format("num3 en formato exponencial cifras:  %.3e", num3));
        System.out.println(String.format("num4 con separador de miles y decimales:  %,.2f", num4));

        System.out.println("\nUso de String.out.printf parra formateo de numeros flotantes: ");
        System.out.printf("num1 y num2 en formato flotante: %f - %f\n", num1, num2);
        System.out.printf("num3 y num4 en formato flotante con decimales: %.2f - %.2f\n", num1, num2);
        System.out.printf("num4 y num5 en formato exponencial: %e - %e\n", num4, num5);
        System.out.printf("num4 y num5 en formato exponencial con decimales: %.2e - %.2e\n", num4, num5);

        System.out.println("\nUso de MIN_VALUE y MAX_VALUE para conocer los rangos de los numeros flotantes");
        System.out.println(String.format("\nTipo float  Min: %.1e  Max %.1e", Float.MIN_VALUE, Float.MAX_VALUE));
        System.out.println(String.format("\nTipo double  Min: %.1e  Max %.1e", Double.MIN_VALUE, Double.MAX_VALUE));




    }
    
}
