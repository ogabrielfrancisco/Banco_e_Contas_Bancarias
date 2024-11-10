package banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        Conta conta1 = new Conta(1001, cliente1);
        Conta conta2 = new Conta(1002, cliente2);

        Banco banco = new Banco();
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(500.0);
        conta1.sacar(200.0);
        System.out.println("Saldo da conta de João: " + conta1.getSaldo());

        conta2.depositar(1000.0);
        conta2.sacar(150.0);
        System.out.println("Saldo da conta de Maria: " + conta2.getSaldo());
    }
}