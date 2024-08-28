package aplicacao;

import java.util.*;

import entidades.Funcionarios;

public class Empresa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionarios funcionarios = new Funcionarios();

        System.out.print("Nome: ");
        funcionarios.nome = sc.nextLine();

        System.out.print("Salário bruto: ");
        funcionarios.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        funcionarios.imposto = sc.nextDouble();

        System.out.println("Funcionário(a): " + funcionarios.nome + ", R$ " + funcionarios.salarioLiquido());

        System.out.println("Qual porcentagem para aumentar o salário");

        // Quando o método tiver um parâmentro, é preciso atribuir o valor para uma
        // variável primeiro e logo após atruibuir o valor para o parãmentro
        double porcentagem = sc.nextDouble();
        funcionarios.aumentarSalario(porcentagem);

        System.out.println(" Dados Atualizados: " + funcionarios);

    }

}
