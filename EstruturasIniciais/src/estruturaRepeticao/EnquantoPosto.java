package estruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class EnquantoPosto {

    static void main(String[] args) {

        // separador de decimais como ponto
        Locale.setDefault(Locale.US);

        // Criação do objeto sc (Scanner)
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um tipo de combustível:");
        System.out.println("1. Ácool 2. Gasolina 3.Diesel 4.Fim");
        int codigo = sc.nextInt();
        int qntAlcool = 0, qntGasolina = 0, qntDiesel = 0;

        while (codigo != 4) {

            if (codigo == 1) {

                qntAlcool += 1;
            } else if (codigo == 2) {

                qntGasolina += 1;

            } else if (codigo == 3) {

                qntDiesel += 1;

            }

            codigo = sc.nextInt();

        }

        System.out.println(
                "MUITO OBRIGADO\n" + "Alcool:" + qntAlcool + "\nGasolina:" + qntGasolina + "\nDiesel:" + qntDiesel);

        // usado quando não precisar mais do objeto sc
        sc.close();

    }

}
