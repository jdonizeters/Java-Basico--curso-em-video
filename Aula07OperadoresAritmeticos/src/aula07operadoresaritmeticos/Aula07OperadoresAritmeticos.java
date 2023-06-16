/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07operadoresaritmeticos;

/**
 *
 * @author jdoni
 */
public class Aula07OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 6;
        String numeroEmTexto1 = "10";
        String numeroEmTexto2 = "12";
        float media = (n1 + n2) / 2;
        float resto = (n1 + n2) % 2;

        System.out.println("-- Operadores aritméticos --");
        System.out.println("A media é igual a "+media);
        System.out.println("O resto é igual a "+resto);

        System.out.println("");
        n1 = Integer.parseInt(numeroEmTexto1);
        n2 = Integer.parseInt(numeroEmTexto2);
        media = (n1 + n2) / 2;
        resto = (n1 + n2) % 2;

        System.out.println("A media (convertendo texto para número) é igual a "+media);
        System.out.println("O resto é igual a "+resto);
        
        System.out.println("");
        System.out.println("-- Operadores unários --");
        n1 = 5;
        n1++;
        System.out.println("O valor de n1 é igual a "+n1);

        n1--;
        System.out.println("O valor de n1 é igual a "+n1);

        System.out.println("");
        System.out.println("-- Operadores unários pré-incremento --");
        int numero = 5;
        int valor = 5 + ++numero; //pré incremento
        System.out.println("O valor de valor é igual a "+valor);
        System.out.println("O valor de numero é igual a "+numero);
                
        System.out.println("-- Operadores unários pós-incremento --");
        numero = 10;
        valor = 4 + numero--; //pós incremento
        System.out.println("O valor de valor é igual a "+valor);
        System.out.println("O valor de numero é igual a "+numero);
        
        //Operadores de atribuição
        System.out.println("");
        System.out.println("-- Operadores de atribuição --");
        numero = 10;
        numero += 2; // Serve para qualquer operador
        System.out.println("O valor de numero é igual a "+numero);
        
        float capital = 0f;
        float taxa = 0;
        float juros = 0f;
        float montante = 0f;
        int prazo = 0;
        float indiceAcumulado = 0f;
        
        System.out.println("-- Classe Math --");
        System.out.println(" - Potência -");
        capital = 1000f;
        taxa = 1f;
        prazo = 12;
        indiceAcumulado = (float) Math.pow(1 + (taxa/100),prazo);
        montante = capital * indiceAcumulado;
        juros = montante - capital;
        System.out.println("Capital : " + capital);
        System.out.println("Taxa    : " + taxa);
        System.out.println("Prazo   : " + prazo);
        System.out.println("Ind.Ac. : " + indiceAcumulado);
        System.out.println("Montante: " + montante);
        System.out.println("Juros   : " + juros);
        
        System.out.println("");
        System.out.println(" - Raiz quadra -");
        numero = 36;
        valor = (int) Math.sqrt(numero);
        System.out.println("Raiz quadra de " + numero + " é " + valor);
        
        System.out.println("");
        System.out.println("Valor de PI é "+Math.PI);

        System.out.println("");
        System.out.println(" - Arredondamentos -");
        System.out.println("Abs de -10 é "+Math.abs(-10));
        System.out.println("Arredonda para baixo (floor) 3.9 é "+Math.floor(3.9));
        System.out.println("Arredonda para cima (ceil) 4.2 é "+Math.ceil(4.2));
        System.out.println("Arredonda aritmeticamente (round) 5.6 é "+Math.round(5.6));

        System.out.println("");
        System.out.println(" - Número randomico -");
        double aleatorio = Math.random();
        System.out.println("Número randomico gerado é "+aleatorio);

        System.out.println("");
        System.out.println(" - Número randomico entre um intervalo -");
        int numeroSorteado = 0;
        aleatorio = Math.random();
        numeroSorteado = (int) (1 + aleatorio * (60-1));
        System.out.println("Número randomico gerado é "+numeroSorteado);
    }
    
}
