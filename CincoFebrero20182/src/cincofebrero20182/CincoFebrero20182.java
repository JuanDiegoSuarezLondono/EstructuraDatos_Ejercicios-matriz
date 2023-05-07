/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cincofebrero20182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author suare
 */
public class CincoFebrero20182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int cantidadAlumnos=0;
        int comando=-1;
        String nombres[]=new String[100];
        int edades[]=new int[100];      
        int mayor=0;
        int menor=0;
        int conteoMayor=0;
        int conteoMenor=0;
        int promedio=0;
        
        do {
        System.out.println();
        System.out.println("1) Ingresar datos");
        System.out.println("2) Menores de edad");
        System.out.println("3) Mayores de edad");
        System.out.println("4) Estudiante menor");
        System.out.println("5) Estudiante mayor");
        System.out.println("6) Promedio de edad");        
        System.out.println("7) Salir");
        comando=Integer.parseInt(br.readLine());
        System.out.println();
        System.out.println();
        switch(comando) {
            case 1:
                System.out.println("Ingrese el nombre del alumno: ");
                nombres[cantidadAlumnos]=br.readLine();
                System.out.println("Ahora ingresar la edad: ");
                edades[cantidadAlumnos]=Integer.parseInt(br.readLine());                
                if(edades[cantidadAlumnos]<18) {
                    conteoMenor++;
                }
                else {
                    conteoMayor++;
                }
                if(edades[cantidadAlumnos]>=edades[mayor]) {
                    mayor=cantidadAlumnos;
                }
                if(edades[cantidadAlumnos]<=edades[menor]) {
                    menor=cantidadAlumnos;
                }
                promedio+=edades[cantidadAlumnos];                 
                cantidadAlumnos++;
            break;
            
            case 2:
                for (int i=0;i<cantidadAlumnos;i++) {
                    if (edades[i]<18) {
                        System.out.println("El estudiante "+nombres[i]+" con edad de "+edades[i]+" es menor");
                    }
                }
            System.out.println("Cantidad de estudiantes mayores: "+conteoMenor); 
            break;
            
            case 3:
                for (int i=0;i<cantidadAlumnos;i++) {
                    if (edades[i]>=18) {
                        System.out.println("El estudiante "+nombres[i]+" con edad de "+edades[i]+"es mayor");
                    }
                }
                System.out.println("Cantidad de estudiantes mayores: "+conteoMayor);
            break;
            
            case 4:
                System.out.println("El estudiante menor es: "+nombres[menor]+" con "+edades[menor]); 
            break;
            
            case 5:
                System.out.println("El estudiante mayor es: "+nombres[mayor]+" con "+edades[mayor]); 
            break;
            
            case 6:
                promedio/=cantidadAlumnos; 
                System.out.println("El promedio de edad es: "+promedio); 
            break;
            
            case 7:
                comando=0;
            break;
            
            default:
                System.out.println("No es un numero del menu... dahhhh");                 
            break;
            }
        } while(comando!=0);                 
    }
    
}
