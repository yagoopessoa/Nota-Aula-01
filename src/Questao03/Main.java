package Questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        System.out.println("\n*PROMOÇÃO* Sabonetes a: R$ " + p.preco + " (un.)");
        System.out.println("\nEstoque atual de Sabonetes: " + p.quantidadeEmEstoque + " unidade(s)");
        System.out.println("Adicionar unidades ao Estoque: ");
        System.out.println("Quantidade adicionada: " + p.adicionarEstoque(sc.nextInt()));

        System.out.println("Quantidade comprada por clientes: ");
        System.out.println("Estoque restante de Sabonete: " + p.venderEstoque(sc.nextInt()));

        sc.close();
    }
}
