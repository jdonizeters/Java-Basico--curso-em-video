/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08operadoreslogicos;

/**
 *
 * @author jdoni
 */
public class Aula08OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean paula = true;
        boolean quesia = true;
        boolean resultado ;
        
        resultado = paula && quesia?true:false;
        System.out.println(resultado);

        paula=false;
        resultado = paula && quesia?true:false;
        System.out.println(resultado);

        paula=false;
        resultado = paula || quesia?true:false;
        System.out.println(resultado);

        paula=true;
        resultado = paula ^ quesia?true:false;
        System.out.println(resultado);
        
    }
    
}
