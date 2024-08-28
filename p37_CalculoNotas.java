// p37_CalculoNotas - p37_CalculoNotas
import java.util.Scanner; 

public class p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int cal1, cal2, cal3, cal4, cal5, calFinal;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nEvaluando calificaciones");
        System.out.print("Dame la calificacion 1: ");
        cal1 = obj.nextInt();
        System.out.print("Dame la calificacion 2: ");
        cal2 = obj.nextInt();
        System.out.print("Dame la calificacion 3: ");
        cal3 = obj.nextInt();
        System.out.print("Dame la calificacion 4: ");
        cal4 = obj.nextInt();
        System.out.print("Dame la calificacion 5: ");
        cal5 = obj.nextInt();

        calFinal = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;

        if (calFinal > 0 && calFinal <=6) {
            System.out.println("Quedas reprobado, tu calificacion fue de "+calFinal);}
        else
        
            if (calFinal >6 && calFinal <=7) {
            System.out.println("Pasas de panzazo, tu calificacion fue de "+calFinal); }
            else  
        
            if (calFinal >7 && calFinal <=8) {
            System.out.println("Muy bien, pues mejorar, tu calificacion fue de "+calFinal); }
            else   
        
                if ( calFinal >8 && calFinal <=9) {
                System.out.println("Excelente sigue así, tu calificacion fue de "+calFinal);  }
                else 
          
                    if (calFinal >9 && calFinal <=10) {
                    System.out.println("Perfecto tu esfuerzo valió la pena, tu calificacion fue de "+calFinal); }  
        
        


        
    }
}
