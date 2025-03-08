package Questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();

        System.out.println("Digite o nome do usuário: ");
        cb.nome = sc.nextLine();
        System.out.println("Saldo Atual: R$ "+ cb.saldo);
        System.out.println("Digite o valor do Depósito: ");
        System.out.println("Saldo bancário: R$ " + cb.depositar(sc.nextDouble()));

        System.out.println("Digite o valor para Transferência: ");
        System.out.println("Saldo bancário: R$ " + cb.transferencia(sc.nextDouble()));

        System.out.println("Digite o valor para Saque: ");
        System.out.println("Saldo bancário: R$ " + cb.saque(sc.nextDouble()));
    sc.close();
    }
}
