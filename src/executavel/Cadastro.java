package executavel;
import objetos.Conta;
import javax.swing.JOptionPane;

public class Cadastro {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setConta(Integer.parseInt(JOptionPane.showInputDialog("Conta")));
        c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta")));
        JOptionPane.showMessageDialog(null, "Conta: " + c.getConta() + "\n" + "Saldo: " +c.getSaldo() + "\n");
        c.creditar(Double.parseDouble(JOptionPane.showInputDialog("Credito")));
        JOptionPane.showMessageDialog(null, "Conta: " + c.getConta() + "\n" + "Saldo: " +c.getSaldo() + "\n");
    }
}
