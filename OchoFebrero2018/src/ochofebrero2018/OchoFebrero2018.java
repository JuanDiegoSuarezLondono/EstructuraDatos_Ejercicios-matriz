/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ochofebrero2018;
import java.util.*;

/**
 *
 * @author suare
 */
public class OchoFebrero2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas=10;
        int columnas=10;
        int numeros[][]=new int[filas][columnas];  
        int conteoPrimo=0;
        int fila[]=new int[filas];
        int columna[]=new int[columnas];
        ArrayList<Integer> primos=new ArrayList<Integer>();
        
        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {           
            numeros[i][j]=(j+1)+i*columnas;
            System.out.print(numeros[i][j]+"\t");
            }  
            System.out.println();
        }
        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {
                for(int k=1;k<=numeros[i][j];k++){
                    if(numeros[i][j]%k==0) {
                        conteoPrimo++;
                    }              
                }    
                if(conteoPrimo==2) {
                        primos.add(numeros[i][j]);
                        fila[i]++;
                        columna[j]++;
                    }   
                conteoPrimo=0;
            }            
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<primos.size();i++) {
            System.out.print(primos.get(i)+"\t");
        }        
        System.out.println();
        System.out.println("Hay "+primos.size()+" primos en toda la matriz");
        for(int i=0;i<filas;i++) {
            System.out.println("En la fila "+(i+1)+" hay "+fila[i]+" primos");
        }
        for(int i=0;i<columnas;i++) {
            System.out.println("En la columna "+(i+1)+" hay "+columna[i]+" primos");
        }        
    }     
}
