/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OchoFebrero20182;

import java.util.*;

/**
 *
 * @author suare
 */
public class OchoFebrero20182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int transpuesta[][];
        //int matriz[][]=CrearMatriz(filas, columnas);
        int matrizUno[][]={{-8,-1,3},{-1,7,4},{3,4,9}};
        int matrizDos[][]={{1,2,-8},{13,12,7},{2,2,9}};
        int vectorUno[]={3,4,9};
        int enteroUno=3;
        System.out.println("Matriz uno:");
        Graficar(matrizUno, matrizUno.length, matrizUno[0].length);
        System.out.println();
        System.out.println("Transpuesta matriz uno:");
        transpuesta=Transpuesta(matrizUno,matrizUno.length, matrizUno[0].length);   
        System.out.println();
        System.out.println("¿Es simetrica la matriz uno?: "+Simetrica(matrizUno, transpuesta, matrizUno.length, matrizUno[0].length));
        System.out.println();
        System.out.println("Matriz dos:");
        Graficar(matrizDos, matrizDos.length, matrizDos[0].length);
        System.out.println();
        System.out.println("Elementos de la matriz A encontrada en B:");
        ElEmentosDeAEnB(matrizUno, matrizDos);
        System.out.println();
        System.out.println("Intercambiar la primera y la ultima columna de la matriz uno:");
        IntercambiarColumna(matrizUno);
        System.out.println();
        System.out.println("Intercambiar la primera y la ultima columna de la matriz uno:");
        IntercambiarColumna(matrizUno);
        System.out.println();
        System.out.println("Vector uno: ");
        Graficar(vectorUno, vectorUno.length); 
        System.out.println();
        EncontrarEnMatriz(matrizUno, vectorUno);
        System.out.println();
        System.out.println("Sumatorias de la matriz uno: ");
        Sumatoria(matrizUno);
        System.out.println();
        System.out.println("El entero uno es:"+enteroUno);
        System.out.println();
        EncontrarEnMatriz(matrizUno, enteroUno);        
    }
    
     public static void EncontrarEnMatriz(int matrizUno[][], int enteroUno) {
        boolean siHay=false;
        for(int i=0;i<matrizUno.length;i++){            
            for(int j=0;j<matrizUno[0].length;j++) {
                if(matrizUno[i][j]==enteroUno) {
                    System.out.println("En la fila "+(i+1)+" columna "+(j+1)+" de la matriz uno se encuentra el entero "+enteroUno);
                    siHay=true;                        
                }
            }
        }
        if(siHay==false) {
            System.out.println("No se encontro el entero "+enteroUno+" en la matriz uno");
        }
    }
    
    public static void Sumatoria(int matriz[][]) {
        int matrizNueva[][]=new int[matriz.length+1][matriz[0].length+1];
        int suma=0;
        int vectorSuma[]=new int[matriz.length+1];
        int sumaTotal=0;
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[0].length;j++) {
                matrizNueva[i][j]=matriz[i][j];
                matrizNueva[matriz.length][j]+=matriz[i][j];
                sumaTotal+=matriz[i][j];
                suma+=matriz[i][j];
            }
            matrizNueva[i][matriz[0].length]=suma;
            suma=0;
        }   
         matrizNueva[matriz.length][matriz[0].length]=sumaTotal;
         Graficar(matrizNueva, matrizNueva.length, matrizNueva[0].length);
    }
    
    public static void EncontrarEnMatriz(int matrizUno[][], int vectorUno[]) {
        int contador=0;
        if(vectorUno.length==matrizUno[0].length){
            for(int i=0;i<matrizUno.length;i++){            
                for(int j=0;j<matrizUno[0].length;j++) {
                    if(matrizUno[i][j]==vectorUno[j]) {
                        contador++;                        
                    }
                    else {
                        contador=0;
                        break;
                    }
                }
                if(contador==vectorUno.length) {
                    System.out.println("En la fila numero "+(i+1)+" de la matriz esta el vector.");
                    break;
                }
            }        
        }
        else {
            System.out.println("El vector no tiene el mismo numero de elementos que columnas tiene la matriz.");
        }
    }  
    
    public static void IntercambiarColumna(int matrizUno[][]) {
        int retener[]=new int[matrizUno[0].length];
        for(int i=0;i<matrizUno.length;i++) {
            retener[i]=matrizUno[i][0];
            matrizUno[i][0]= matrizUno[i][matrizUno[0].length-1];
            matrizUno[i][matrizUno[0].length-1]=retener[i];
        }
        Graficar(matrizUno, matrizUno.length, matrizUno[0].length);
    }
    
    public static void ElEmentosDeAEnB(int matrizUno[][],int matrizDos[][]) {
        boolean salir=false;
        for(int i=0;i<matrizUno.length;i++){            
            for(int j=0;j<matrizUno[0].length;j++) {
                for(int k=0;k<matrizDos.length;k++) {
                    for(int l=0;l<matrizDos[0].length;l++) {
                        if(matrizUno[i][j]==matrizDos[k][l]) {
                            salir=true;
                            System.out.println("El elemento "+matrizUno[i][j]+" ubicado en la fila "+(i+1)+" y columna "+(j+1)+" se encuentra en la matriz B");
                            break;
                        }
                    }
                    if(salir==true) {
                            break;
                        }
                }
                salir=false;
            }
        }
    }
    
    public static void Graficar(int vector[],int filas) {
        for(int i=0;i<filas;i++) {
            System.out.print(vector[i]+"\t");
        }               
        System.out.println();
    }
    
    public static void Graficar(int matriz[][],int filas, int columnas) {
        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {           
                System.out.print(matriz[i][j]+"\t");
            }  
            System.out.println();
        }               
    }
    
    public static int[][] CrearMatriz(int filas, int columnas){
        int matriz[][]=new int[filas][columnas]; 
        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {           
            matriz[i][j]=(j+1)+(i*columnas);
            System.out.print(matriz[i][j]+"\t");
            }  
            System.out.println();
        }
        return matriz;
    }
    
    public static int[][]  Transpuesta(int matriz[][],int filas,int columnas){
        int transpuesta[][]=new int[columnas][filas];
        for(int i=0;i<columnas;i++) {
            for(int j=0;j<filas;j++) {           
            transpuesta[i][j]=matriz[j][i];
            System.out.print(transpuesta[i][j]+"\t");
            }  
            System.out.println();
        }    
        return transpuesta;
    }    
    
    public static boolean Simetrica(int matriz[][],int transpuesta[][],int filas, int columnas){
        boolean siEs=true;
        if(filas==columnas) {
            for(int i=0;i<columnas;i++) {
                for(int j=0;j<filas;j++) {
                    if(matriz[i][j]!=transpuesta[i][j]) {                          
                        siEs=false;
                        System.out.println("entro");
                        break;                       
                    }
                }
                if(siEs==false) {  
                    break;                       
                } 
            }    
            return siEs;
        }
        else {
            return false;
        }                               
    }
            
}
