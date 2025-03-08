package Questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        System.out.println("*PROMOÇÃO* Sabonetes a: R$ " + p.preco + " (un.)");
        System.out.println("Quantidade em Estoque de Sabonete: " + p.quantidadeEmEstoque);
        System.out.println("Quantidade adicional do Sabonete: ");
        System.out.println("Quantidade adicionada: " + p.adicionarEstoque(sc.nextInt()));



        System.out.println("Quantidade comprada por clientes: ");
        System.out.println("Quantidade atual do Sabonete: " + p.venderEstoque(sc.nextInt()));

        sc.close();
    }
}
