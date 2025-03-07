package Questao01;

public class Aluno {
    double nota1, nota2, nota3, resultado;
    String nome;
    public double mediaAluno() {
        resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
    }

}
