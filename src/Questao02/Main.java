package Questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matematica m = new Matematica();
        String r;


        System.out.println("Digite o valor 1: ");
        m.n1 = sc.nextDouble();
        System.out.println("Digite o valor 2: ");
        m.n2 = sc.nextDouble();

        do {
            System.out.println("Digite 1 para Somar; Digite 2 para Subtrair; Digite 3 para Dividir; Digite 4 para Multiplicar;");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("O resultado da Soma: " + m.somar());
                    break;
                case 2:
                    System.out.println("O resultado da Subtração: " + m.subtrair());
                    break;
                case 3:
                    System.out.println("O resultado da Divisão: " + m.dividir());
                    break;
                case 4:
                    System.out.println("O resultado da Multiplicação: " + m.multiplicar());
                    break;
                default:
                    System.out.println("Valor Inválido");
            }
            System.out.println("Realizar outra operação? (S/N)");
            r = sc.next();
        }while (r.equalsIgnoreCase("S"));
        sc.close();

    }

}