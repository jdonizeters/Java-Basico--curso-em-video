/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04informacoesdocomputador;

import java.awt.Toolkit;
import java.util.Locale;

/**
 *
 * @author jdoni
 */
public class Aula04InformacoesDoComputador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Locale defaultLocale = Locale.getDefault();
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        System.out.println("Idioma     : " + defaultLocale.getLanguage());
        System.out.println("Sigla Pais : " + defaultLocale.getCountry());
        System.out.println("Nome       : " + defaultLocale.getDisplayCountry());

        int screenWidth = (int) toolkit.getScreenSize().getWidth();
        int screenHeight = (int) toolkit.getScreenSize().getHeight();
        System.out.println("Resolucao da tela: " + screenWidth + "x" + screenHeight);        

    }
    
}
