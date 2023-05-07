/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cincofebrero2018conmatriz;
import java.io.*;

/**
 *
 * @author suare
 */
public class CincoFebrero2018ConMatriz {
    public static void main(String[] args) throws IOException {
        //Fila 1 nombres materias, 2 creditos, 3 notas, 4 productos
        String matrizSemestre[][]=new String[4][7];
        matrizSemestre[0][0]="estructura de datos";
        matrizSemestre[0][1]="fisica mecanica";
        matrizSemestre[0][2]="calculo";
        matrizSemestre[0][3]="ingles";
        matrizSemestre[0][4]="Arquitectura";
        matrizSemestre[0][5]="Analisis";
        matrizSemestre[0][6]="Promedios";
        
        matrizSemestre[1][0]="3";
        matrizSemestre[1][1]="3";
        matrizSemestre[1][2]="3";
        matrizSemestre[1][3]="1";
        matrizSemestre[1][4]="4";
        matrizSemestre[1][5]="3";
        
        matrizSemestre[1][6]="0";
        matrizSemestre[3][6]="0";
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<6;i++) {
            System.out.println("Ingrese la nota de la asignatura "+matrizSemestre[0][i]+": ");
            matrizSemestre[2][i]=br.readLine();
            if (Double.parseDouble(matrizSemestre[2][i])<0 || Double.parseDouble(matrizSemestre[2][i])>5) {
                System.out.println("No es una nota valida, intente ingresar otra...");
                i--;
                }
            else {      
                matrizSemestre[1][6]=String.valueOf(Integer.parseInt(matrizSemestre[1][6])+Integer.parseInt(matrizSemestre[1][i]));
                matrizSemestre[3][i]=String.valueOf(Integer.parseInt(matrizSemestre[1][i])*Double.parseDouble(matrizSemestre[2][i]));
                matrizSemestre[3][6]=String.valueOf(Double.parseDouble(matrizSemestre[3][6])+Double.parseDouble(matrizSemestre[3][i]));
            }            
        }      
        System.out.println();
        System.out.println();
        System.out.println("Nombre materia\t\tNumero creditos\t\tNota");
        System.out.println("_____________________________________________________");
        System.out.println(matrizSemestre[0][0]+"\t"+matrizSemestre[1][0]+"\t\t\t"+matrizSemestre[2][0]);
        System.out.println(matrizSemestre[0][1]+"\t\t"+matrizSemestre[1][1]+"\t\t\t"+matrizSemestre[2][1]);
        System.out.println(matrizSemestre[0][2]+"\t\t\t"+matrizSemestre[1][2]+"\t\t\t"+matrizSemestre[2][2]);
        System.out.println(matrizSemestre[0][3]+"\t\t\t"+matrizSemestre[1][3]+"\t\t\t"+matrizSemestre[2][3]);
        System.out.println(matrizSemestre[0][4]+"\t\t"+matrizSemestre[1][4]+"\t\t\t"+matrizSemestre[2][4]);
        System.out.println(matrizSemestre[0][5]+"\t\t"+matrizSemestre[1][5]+"\t\t\t"+matrizSemestre[2][5]);
        System.out.println("_____________________________________________________");  
        matrizSemestre[2][6]=String.valueOf(Double.parseDouble( matrizSemestre[3][6])/Integer.parseInt(matrizSemestre[1][6]));
        System.out.println("Total semestre: "+"\t"+matrizSemestre[1][6]+"\t\t\t"+((double)Math.round(Double.parseDouble(matrizSemestre[2][6])*10d)/10d));
        
        if(((double)Math.round(Double.parseDouble(matrizSemestre[2][6])*10d)/10d)<3.3) {
            System.out.println("Usted no ha aprobado esta materia, pero recuerde 'la materia no se crea ni se destruye, se repite'");
        }
        else {
            System.out.println("Felicidades, usted ha aprobado, se gano una galleta =3");
        }
    }    
}
