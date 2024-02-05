package objetos;

public class Banco {
    private Conta[] contas;
    private int indiceC;

    public Banco() {
        this.contas = new Conta[100];
        this.indiceC = 0;
    }

    private Conta procurarConta(String numero) {
        int i = 0;
        boolean achou = false;
        Conta resposta = null;
        while ((!achou) && (i < indiceC)) {
            if (contas[i].getNumero().equals(numero)) {
                achou = true;
                resposta = contas[i];
            }
            else
                i += 1;
        }
        if (!achou)
            throw new RuntimeException("Não achou");
        return resposta;
    }

    public void cadastrar(Conta c) {
        contas[indiceC] = c;
        indiceC += 1;
    }
    public void creditar(String numero, double valor) {
        Conta c;
        c = this.procurarConta(numero);
        c.creditar(valor);
    }
    public void debitar(String numero, double valor) {
        Conta c;
        c = this.procurarConta(numero);
        c.debitar(valor);
    }
    public double getSaldo(String numero) {
        Conta c = this.procurarConta(numero);
        return c.getSaldo();
    }
}
