/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cincofebrero2018;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author suare
 */
public class CincoFebrero2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String asignatura[]={"estructura de datos", "fisica mecanica", "calculo", "ingles", "Arquitectura", "Analisis"};
        int creditos[]={3,3,3,1,4,3};
        double nota[]=new double[6];
        double productos[]=new double[6];
        double sumaProductos=0;
        int SumaCreditos=0;
        double promedioSem=0;
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<6;i++) {
            System.out.println("Ingrese el valor de la asignatura "+asignatura[i]+": ");
            nota[i]=Double.parseDouble(br.readLine());
            if (nota[i]<0 || nota[i]>5) {
                System.out.println("No es una nota valida, intente ingresar otra...");
                i--;
                }
            else {
                productos[i]=creditos[i]*nota[i];
            }
            sumaProductos+=productos[i];
            SumaCreditos+=creditos[i];
        }      
        System.out.println();
        System.out.println();
        System.out.println("Nombre materia\t\tNumero creditos\t\tNota");
        System.out.println("____________________________________________________");
        System.out.println(asignatura[0]+"\t"+creditos[0]+"\t\t\t"+nota[0]);
        System.out.println(asignatura[1]+"\t\t"+creditos[1]+"\t\t\t"+nota[1]);
        System.out.println(asignatura[2]+"\t\t\t"+creditos[2]+"\t\t\t"+nota[2]);
        System.out.println(asignatura[3]+"\t\t\t"+creditos[3]+"\t\t\t"+nota[3]);
        System.out.println(asignatura[4]+"\t\t"+creditos[4]+"\t\t\t"+nota[4]);
        System.out.println(asignatura[5]+"\t\t"+creditos[5]+"\t\t\t"+nota[5]);
        System.out.println("____________________________________________________");        
        promedioSem=sumaProductos/SumaCreditos;
        System.out.println("Su promedio es "+(double)Math.round(promedioSem*10d)/10d);
        if(((double)Math.round(promedioSem*10d)/10d)<3.3) {
            System.out.println("Usted no ha aprobado esta materia, pero recuerde 'la materia no se crea ni se destruye, se repite'");
        }
        else {
            System.out.println("Felicidades, usted ha aprobado, se gano una galleta =3");
        }
        // TODO code application logic here
    }    
}
/*Hacer un programa que pida la edad de n estudiantes, almacenar en un vector de tipo string el nombre
del alumno, mostrar quienes y cuantos son menores de edad y quienes y cuantos son mayores de edad, 
promedio de edad, el estudiante de menor edad y el de mayor edad, se debe presentar un menu donde el 
usuario pueda escoger la opcion que desea visualizar estructurasdedatosusta@gmail.com*/
