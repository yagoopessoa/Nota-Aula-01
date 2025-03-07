package Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();


        System.out.println("Nome do aluno: ");
        a.nome = sc.nextLine();
        System.out.println("Digite a Nota 1: ");
        a.nota1 = sc.nextDouble();
        System.out.println("Digite a Nota 2: ");
        a.nota2 = sc.nextDouble();
        System.out.println("Digite a Nota 3: ");
        a.nota3 = sc.nextDouble();

        System.out.println("A média foi de: " + a.mediaAluno());

        if (a.resultado >= 7){
            System.out.println(a.nome + " está Aprovado");
        }else if (a.resultado < 4){
            System.out.println(a.nome + "Você está Reprovado");
        }else{
            System.out.println(a.nome + "Você está Final");
        }

        sc.close();

    }
}
