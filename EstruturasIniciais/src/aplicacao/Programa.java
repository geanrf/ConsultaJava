package aplicacao;

import java.util.*;

import entidades.*;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println(" Insira os dados do produto ");

        System.out.print("Name: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        // System.out.println(produto.nome + ", " + produto.preco + ", " +
        // produto.quantidade);

        // toString
        System.out.println("\n Dados do produto " + produto);

        System.out.println("\n insira a quantidade de produtos a serem adicionados em estoque ");
        int qtdAdd = sc.nextInt();
        produto.adicionaProdutos(qtdAdd);

        System.out.println("\n Dados atualizados: " + produto);

        System.out.println("\n insira a quantidade de produtos a serem removidos em estoque ");
        int qtdRemove = sc.nextInt();
        produto.removeProdutos(qtdRemove);

        System.out.println("\n Dados atualizados: " + produto);

        sc.close();

    }

}
