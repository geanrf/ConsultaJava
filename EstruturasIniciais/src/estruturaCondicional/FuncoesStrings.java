package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class FuncoesStrings {

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

        String nome = "GeAn RoChA Ximenes GeAn -";
        // Converte todas as String em minuscúlas
        String nMaiuscula = nome.toLowerCase();
        // Converte todas as String em maiusculas
        String nMinuscula = nome.toUpperCase();
        // Apaga o inicio e o final que estiverem em branco na String
        String apagaEspacos = nome.trim();
        // Inicia a String após o parãmetro
        String iniciaAposParamentro = nome.substring(2);
        // Inicia a String após o primeiro parãmetro e vai até o segundo.
        String inicioEFim = nome.substring(2, 9);
        // Troca a letra do parãmetro 1 pela a do parãmetro 2
        String trocaLetra = nome.replace('G', 'J');
        // Troca a palavra do parãmetro 1 pela a do parãmetro 2
        String trocaPalavra = nome.replace("GeAn", "Gabriel");
        // Localiza a posição inicial do indice com base no parãmetro
        int localizaInicio = nome.indexOf("GeAn");
        // Localiza a posição final do indice com base no parãmetro
        int localizaFinal = nome.lastIndexOf("GeAn");

        System.out.println("Original: " + nome);
        System.out.println("toLowerCase: " + nMaiuscula);
        System.out.println("toUpperCase: " + nMinuscula);
        System.out.println("Trim: " + apagaEspacos);
        System.out.println("SubString(2): " + iniciaAposParamentro);
        System.out.println("SubString(2, 9): " + inicioEFim);
        System.out.println("Replace('G' por ,'J'): " + trocaLetra);
        System.out.println("Replace('GeAn','Gabriel'): " + trocaPalavra);
        System.out.println("indexOf('GeAn'): " + localizaInicio);
        System.out.println("lastIndexOf('GeAn'): " + localizaFinal);

        // usado quando não precisar mais do objeto sc
        sc.close();
    }

}
