/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08comparacaostring;

/**
 *
 * @author jdoni
 */
public class Aula08ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        
        res = nome1 == nome2?"Sim":"Não";
        System.out.println(res);

        res = nome1 == nome3?"Sim":"Não";
        System.out.println(res);
        
        res = nome1.equals(nome3)?"Sim":"Não";
        System.out.println(res);
        
    }
    
}
