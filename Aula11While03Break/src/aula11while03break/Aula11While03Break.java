/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11while03break;

/**
 *
 * @author jdoni
 */
public class Aula11While03Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        while (contador < 10) {
            contador++;
            if (contador == 2 || contador == 3 || contador == 4){
                continue;
            }
            if(contador == 7){
                break;
            }                
            System.out.println("Cambalhota n. "+ contador);
        }
    }
    
}
