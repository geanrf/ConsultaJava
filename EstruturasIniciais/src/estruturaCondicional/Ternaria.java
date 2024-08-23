package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ternaria {

    public static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        System.out.println("");

        int nota;

        System.out.println("Digite sua nota: ");
        nota = sc.nextInt();

        String media = (nota >= 7) ? "Aprovado" : "Reprovado";

        System.out.println(media);

        // usado quando não precisar mais do objeto sc
        sc.close();
    }

}
