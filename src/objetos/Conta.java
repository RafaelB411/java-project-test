package objetos;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void creditar(double credito) {
        saldo += credito;
    }
    public void debitar(double debito) {
        saldo -= debito;
    }
}
