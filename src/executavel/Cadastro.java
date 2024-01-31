package executavel;
import objetos.Conta;
import javax.swing.JOptionPane;

public class Cadastro {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.setConta(Integer.parseInt(JOptionPane.showInputDialog("Conta 1")));
        c2.setConta(Integer.parseInt(JOptionPane.showInputDialog("Conta 2")));
        c1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta 1")));
        JOptionPane.showMessageDialog(null, "Conta: " + c1.getConta() + "\n" + "Saldo: " + c1.getSaldo() + "\n");
        c1.transferir(c2, Double.parseDouble(JOptionPane.showInputDialog("Valor para transferencia para conta 2")));
        JOptionPane.showMessageDialog(null, "Conta 1: " + c1.getConta() + "\nSaldo: " +c1.getSaldo() + "\nConta 2: " + c2.getConta() + "\nSaldo: " +c2.getSaldo() + "\n");
    }
}
