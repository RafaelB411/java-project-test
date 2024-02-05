package executavel;
import objetos.Conta;

public class Programa {
    public static void main(String[] args) {
        Conta a = new Conta("123-4");
        Conta b;
        b = a;
        b.creditar(100);
        System.out.println(a.getSaldo());
    }
}
