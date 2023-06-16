/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09ifsimples;

import java.util.Scanner;

/**
 *
 * @author jdoni
 */
public class Aula09IfSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float nota1;
        float nota2;
        float media;
        
        System.out.print("Informe a nota 1: ");
        nota1 = teclado.nextFloat();
        
        System.out.print("Informe a nota 2: ");
        nota2 = teclado.nextFloat();
        
        media = (nota1+nota2) / 2;
        
        System.out.println("A nota média é: " + media);
        
        if (media >= 7) {
            System.out.println("Parabéns! Você passou");
        }
            
    }
    
}
