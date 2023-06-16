/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14vetor01;

import java.util.Arrays;

/**
 *
 * @author jdoni
 */
public class Aula14Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor01[] = new int[4]; //forma 1
        int[] vetor02 = new int[4]; // forma 2
        int vetor03[] = {4,1,9,8,2}; // forma 3
        int vetor04[] = new int[4];
        int pos = 0;
        
        for(int contador=0; contador <= 4; contador++){
            System.out.println("Na posição " + contador + " temos os valor " + vetor03[contador]);
        }

        System.out.println("Tamanho do vetor03: "+vetor03.length);
        
        for(int valor:vetor03){
            System.out.println("Usando each: "+valor);
        }
        
        Arrays.sort(vetor03);

        for(int valor:vetor03){
            System.out.println("Ordenado: "+valor);
        }
        
        pos = Arrays.binarySearch(vetor03, 8);
        System.out.println("Encontrei o valor na posição "+ pos );
                
        Arrays.fill(vetor04,8 );
 
        for(int valor:vetor04){
            System.out.println("Fill: "+valor);
        }
        
    }
    
}
