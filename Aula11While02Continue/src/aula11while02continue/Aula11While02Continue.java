/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11while02continue;

/**
 *
 * @author jdoni
 */
public class Aula11While02Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        while (contador < 10) {
            contador++;
            if (contador == 5 || contador == 7){
                continue;
            }
            System.out.println("Cambalhota n. "+ contador);
        }
    }
}
