package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class FuncaoSplit {

    public static void main(String[] args) {

        /*
         * * Camel case: lastName. Para pacotes, atributos, métodos, variáveis e
         * parâmetros.
         * Pascal Case: NameClasse
         */

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        /*
         * É usado para dividir uma string em substrings com base em um delimitador(um
         * caractere ou uma expressão regular). O resultado é um array de strings, onde
         * cada elemento é uma parte da string original que estava entre os
         * delimitadores.
         */
        String s = "Gean-Rocha-Ximenes";
        String[] vect = s.split("-");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        // usado quando não precisar mais do objeto sc
        sc.close();
    }

}
