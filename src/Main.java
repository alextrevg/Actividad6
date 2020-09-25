import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;
import java.lang.*;

public class Main {


    public static void  main(String[]args){

        String name;
        Scanner nombre = new Scanner (System.in);

        System.out.println("Ingresa el nombre del alumno ");
            name=nombre.next();


        int cal5[]= new int[5];
        float promedio;
        int suma=0;

        Scanner calificaciones = new Scanner (System.in);

           System.out.println("Ingresa las cinco calififaciones del alumno");
            cal5[0]=calificaciones.nextInt();
            cal5[1]=calificaciones.nextInt();
            cal5[2]=calificaciones.nextInt();
            cal5[3]=calificaciones.nextInt();
            cal5[4]=calificaciones.nextInt();


        for(int i = 0; i < cal5.length; i++){
            suma += cal5[i];
        }
        promedio=(suma / cal5.length);


            System.out.println("Nombre del alumno: " + name);
            System.out.println("Calificación 1: " + cal5[0]);
            System.out.println("Calificación 2: " + cal5[1]);
            System.out.println("Calificación 3: " + cal5[2]);
            System.out.println("Calificación 4: " + cal5[3]);
            System.out.println("Calificación 5: " + cal5[4]);
            System.out.println("Promedio: " + promedio);

        if (promedio>=0&&promedio<=50)
            System.out.println("Calificación final: F");
        else
        if (promedio>=51&&promedio<=60)
            System.out.println("Calificación final: E");
        else
        if (promedio>61&&promedio<=70)
            System.out.println("Calificación final: D");
        else
        if (promedio>=71&&promedio<=80)
            System.out.println("Calificación final: C");
        else
        if (promedio>=81&&promedio<=90)
            System.out.println("Calificación final: B");
        else
        if (promedio>=91&&promedio<=100)
            System.out.println("Calificación final: A");





       }
}
