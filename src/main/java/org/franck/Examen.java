package org.franck;
import java.util.Scanner;
public class Examen {
    public static void main(String[] args){
        int respuesta;
        System.out.println("===================================== ");
        System.out.println("CONTROL DE CALIFICACIONES");
        System.out.println("=====================================");
        System.out.println("Ingrese la opción que desee:");
        System.out.println("1 - Registrar calificaciones");
        System.out.println("2 - Mostrar estadísticas");
        System.out.println("3 - Salir");
        System.out.println("===Seleccione una Opción===");
        respuesta = respuestaf();
        seleccion(respuesta);
        while(respuesta != 3){
           respuesta = respuestaf();
           seleccion(respuesta);
        }
        System.out.println("Fin del Programa");
    }
    static int respuestaf(){
        Scanner recibir = new Scanner(System.in);
        int respuesta;
        return respuesta = recibir.nextInt();
    }

    static void seleccion(int respuesta) {
        switch (respuesta) {
            case 1:
                registrar();
                System.out.println("Eliga otra opción");
                System.out.println("1 - Registrar calificaciones");
                System.out.println("2 - Mostrar estadísticas");
                System.out.println("3 - Salir");
                break;
            case 2:
                estadisticas();
                System.out.println("Eliga otra opción");
                System.out.println("1 - Registrar calificaciones");
                System.out.println("2 - Mostrar estadísticas");
                System.out.println("3 - Salir");
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no válida intentelo de nuevo");
                break;
        }
    }
    static double tota;
    static int estudiantes;
    static int reprobado;
    static int aprobado;
    static double sumapromedios;
    static void registrar(){
        Scanner recibir = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("          REGISTRAR ESTUDIANTE");
        System.out.println("=====================================");
        System.out.print("¿Cuántos estudiantes registrará?:  ");
        estudiantes = recibir.nextInt();
        for (int i=1;i <= estudiantes;i++){
            System.out.println("-------------------------------------");
            System.out.println("           Estudiante " + i);
            System.out.println("-------------------------------------");
            System.out.print(" Nombre: ");
            String nombre =  recibir.next();
            System.out.print(" Evaluación 1: ");
            double evaluacion1 =  recibir.nextDouble();
            while(evaluacion1 < 0 || evaluacion1 > 10){
                System.out.print("Intentelo de nuevo :");
                evaluacion1 = recibir.nextDouble();
            }
            tota = tota + evaluacion1;
            System.out.print(" Evaluación 2: ");
            double evaluacion2 =  recibir.nextDouble();
            while(evaluacion2 < 0 || evaluacion2 > 10){
                System.out.print("Intentelo de nuevo :");
                evaluacion2 = recibir.nextDouble();
            }
            tota = tota + evaluacion2;
            System.out.print(" Evaluación 3: ");
            double evaluacion3 =  recibir.nextDouble();
            while(evaluacion3 < 0 || evaluacion3 > 10){
                System.out.print("Intentelo de nuevo :");
                evaluacion3 = recibir.nextDouble();
            }
            tota = tota + evaluacion3;
            double promedio = (evaluacion1+evaluacion2+evaluacion3)/3;
            sumapromedios = sumapromedios + promedio;
            if (promedio > 6){
                System.out.println(" Resultado: APROBADO");
                aprobado++;
            }else{
                System.out.println(" Resultado: REPROBADO");
                reprobado++;
            }
        }
    }
    static void estadisticas() {
        System.out.println("=====================================");
        System.out.println("        ESTADÍSTICAS DEL GRUPO");
        System.out.println("=====================================");
        System.out.println("Estudiantes registrados: " + estudiantes);
        System.out.println("Estudiantes aprobados: " + aprobado);
        System.out.println("Estudiantes reprobados: " + reprobado);
        System.out.println("Promedio General: " + (sumapromedios) / estudiantes);
    }
}
