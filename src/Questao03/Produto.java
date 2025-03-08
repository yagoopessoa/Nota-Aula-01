package Questao03;

public class Produto {
    //public String sabonete;
    double preco = 3.75f;
    public int quantidadeEmEstoque;


    public int adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            return quantidadeEmEstoque;

        } else {
            System.out.println("O valor deve ser positivo");
            return quantidadeEmEstoque;
        }
    }
    public int venderEstoque(int quantidadeVenda){
            if (quantidadeVenda > 0 && quantidadeVenda <= quantidadeEmEstoque){
                quantidadeEmEstoque -= quantidadeVenda;
                return quantidadeEmEstoque;
            }else{
                System.out.println("Valor inválido");
                return quantidadeEmEstoque;
            }
        }
    }









