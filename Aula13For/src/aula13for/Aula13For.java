/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13for;

/**
 *
 * @author jdoni
 */
public class Aula13For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int contador=1; contador <= 10; contador++) {
            System.out.println(contador);
        }

        System.out.println("---------------");

        for (int contador = 10; contador >= 1; contador--) {
            System.out.println(contador);
        }
        
        System.out.println("---------------");

        for (int contador=0; contador <= 100; contador+= 10) {
            System.out.println(contador);
        }
    }
    
}
