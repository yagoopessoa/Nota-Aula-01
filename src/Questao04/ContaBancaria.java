package Questao04;

public class ContaBancaria {
    public String nome;
    double saldo;


    public double depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            return saldo;
        } else {
            System.out.println("Valor do depósito não é inválido");
            return saldo;
        }
    }
    public double saque(double sacar){
            if (sacar > 0 && sacar <= saldo){
                saldo -= sacar;
                return saldo;
            }else{
                System.out.println("O valor do saque não é válido.");
                return saldo;
            }
        }

    public double transferencia(double transferir){
            if (transferir > 0 && transferir <= saldo){
                saldo -= transferir;
                return saldo;
            }else{
                System.out.println("O valor da transferência não é válido.");
                return saldo;
            }
        }
}
