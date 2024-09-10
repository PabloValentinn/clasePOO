// ep01_PrimerExamenParcial 

import java.util.Scanner;



public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        String nombre;
        int edad,rechazados=0, alumnos=40, docente=60,trabajador=80, promedioEdad;
        int totalAlumnnos=0, totalDocentes=0, totalTrabajadores=0, totalHombres=0, totalMujeres=0;
        int totalParticipantes=1, hombres, mujeres, totalDinero;
        int totalTodo, alumnillos, docentillos, trabajadorcillos=0;
        char sexo, participante, resp;
        Scanner obj = new Scanner(System.in);
    
        do{
        System.out.println("Participante " + totalParticipantes++);
        System.out.print("Dame el nombre: "); nombre = obj.next();
        System.out.print("Dame la edad: "); edad = obj.nextInt();
        System.out.print("¿Cual es tu sexo? H/M ");  
        sexo = Character.toUpperCase(obj.next().charAt(0));
        System.out.print("¿Que tipo de participante eres? [A]lumno, [D]ocente, [T]rabajador: ");  
        participante = Character.toUpperCase(obj.next().charAt(0));

        

        System.out.println("bienvenid@ "+ nombre + " , tu edad es de " +edad+ " años, tu sexo es "+sexo+" y eres un participante " + participante);
        if (edad <=23) 
            rechazados += 1;  
            switch (sexo) {
                case 'H':
                    hombres = sexo;
                    totalHombres +=1;

                    break;
                case 'M':
                    mujeres = sexo;
                    totalMujeres +=1;
            
                default:
                    break;
            }


            switch (participante) {
                case 'A':
                alumnillos = participante;
                totalAlumnnos +=1;
                    break;
                case 'D':
                docentillos = participante;
                totalDocentes +=1;
                    break;
                case 'T':
                trabajadorcillos=participante;
                totalTrabajadores+=1;
                default:
                    break;


            
        }

            System.out.print("Mas participantes (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

            promedioEdad = edad+edad / participante;


        } while (resp != 'N');


        System.out.println("El total de alumnos es "+totalAlumnnos);
        System.out.println("El total de docentes es "+totalDocentes);
        System.out.println("El total de trabajadores es "+totalTrabajadores);
        System.out.println("El total de hombres es "+totalHombres);
        System.out.println("El total de mujeres es "+totalMujeres);
        System.out.println("El total de participantes es "+((totalParticipantes-1)-rechazados));
        System.out.println("El promedio de edad es "+promedioEdad);
        System.out.println("El total de rechazados es "+rechazados);

        alumnos= alumnos*totalAlumnnos;
        docente = docente*totalDocentes;
        trabajador = trabajador*totalTrabajadores;
        totalDinero = alumnos+docente+trabajador;
        System.out.println("\n Total de dinero recaudado de alumnos: "+alumnos);
        System.out.println("\n Total de dinero recaudado de docentes: "+docente);
        System.out.println("\n Total de dinero recaudado de trabajador: "+trabajador);
        System.out.println("\n Total de dinero en general: "+totalDinero);

        if (totalDinero < 50) {
            System.out.println("El evento concluye con ganancias BAJAS");}
        else
            if (totalDinero > 50 && totalDinero <= 1000) {
                System.out.println("El evento concluye con ganancias MODERADAS");}
                else 
                    System.out.println("El evento concluye con BUENAS ganancias.");

            


        
    }
    
}
