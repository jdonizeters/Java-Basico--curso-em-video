/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15metodo;

/**
 *
 * @author jdoni
 */
public class Aula15Funcao01 {

    static void somaMetodo(int a, int b){
        int soma;
        soma = a + b;
        System.out.println("A soma é: " + soma);
}
    
    static int somaFuncao(int a, int b){
        int soma;
        soma = a + b;
        return soma;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        somaMetodo(10,10);
        
        System.out.println("A soma como função é: " + somaFuncao(20,20));
    }
    
}
