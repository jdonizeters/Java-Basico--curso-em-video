/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatorio;

import java.util.Random;

/**
 *
 * @author jdoni
 */
public class NumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int qtde = 0;
        int[] sorteados = new int[6];
        
        while (qtde < 6) {
            numero = sorteia(60);
            sorteados[qtde] = numero;
            System.out.println("O número é: " + numero);
            qtde++;
        }
        
        qtde = 0;
        while (qtde < 6){
            System.out.println("O número armazenado é: " + sorteados[qtde]);
            qtde++;
        }
                
    }

    public static int sorteia(int limite) {
        Random rand = new Random();
        int aleatorio;

        aleatorio = rand.nextInt(limite)+1;
        return aleatorio;
        }
        
}
