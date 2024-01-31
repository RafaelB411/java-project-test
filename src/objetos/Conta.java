package objetos;
public class Conta {
    private int conta;
    private double saldo;

    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void creditar(double credito) {
        saldo += credito;
    }
    public void debitar(double debito) {
        saldo -= debito;
    }

    public void transferir(Conta contaDestino, double valor) {
        this.debitar(valor);
        contaDestino.creditar(valor);
    }
}
