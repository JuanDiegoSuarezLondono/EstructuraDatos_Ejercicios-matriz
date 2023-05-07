/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catorcefebrero2018puntodoce;
import java.io.*;
/**
 *
 * @author suare
 */
public class CatorceFebrero2018PuntoDoce {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int numeroEstudiantes=0;        
        System.out.print("Ingrese el numero de estudiantes: ");
        numeroEstudiantes=Integer.parseInt(br.readLine());
        System.out.println();
        double notas[][]=new double[numeroEstudiantes][4];
        long codigoEstudiante[]=new long[numeroEstudiantes];
        
        for (int i=0;i<numeroEstudiantes;i++) {
            System.out.print("Ingrese el codigo del estudiante "+(i+1)+": ");
            codigoEstudiante[i]=Long.parseLong(br.readLine());
        }
        System.out.println();
        for (int i=0;i<numeroEstudiantes;i++) {
            System.out.println("Estudiante "+codigoEstudiante[i]);
            for (int j=0;j<3;j++) {
            System.out.print("Igrese la nota del corte "+(j+1)+": ");
            notas[i][j]=Double.parseDouble(br.readLine());
            if(notas[i][j]<0 || notas[i][j]>5) {
                System.out.println("Lo sentimos, las leyes de las computadoras cuanticas no permiten esa nota.");
                j--;
                System.out.println();
                }
            }
            notas[i][3]=(notas[i][0]*0.35)+(notas[i][1]*0.35)+(notas[i][2]*0.3);
            System.out.println();
        }
        System.out.println("\n");
        
        for (int i=0;i<numeroEstudiantes;i++) {
            if(((double)Math.round(notas[i][3]*10d)/10d)<3) {
                System.out.println("El estudiante con el codigo"+codigoEstudiante[i]+" ha reprobado con "+((double)Math.round(notas[i][3]*10d)/10d)+" y va a respawnear en 1 semestre...");
            }
            else {
                System.out.println("El estudiante con el codigo"+codigoEstudiante[i]+" ha pasado con "+((double)Math.round(notas[i][3]*10d)/10d)+" felicidades..Yeiii");
            }            
        }   
    }
}
