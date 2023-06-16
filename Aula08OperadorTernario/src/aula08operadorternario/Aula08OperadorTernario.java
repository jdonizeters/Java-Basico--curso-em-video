/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08operadorternario;

import java.util.Scanner;

/**
 *
 * @author jdoni
 */
public class Aula08OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        String numeroMaior;
        
        System.out.print("Digite o 1o. numero: ");
        numero1 = teclado.nextInt();

        System.out.print("Digite o 2o. numero: ");
        numero2 = teclado.nextInt();
        
        numeroMaior = numero1 > numero2 ? "numero1":"numero2";
        
        System.out.println("");
        System.out.println("O número maior é " + numeroMaior);
        
    }
    
}
