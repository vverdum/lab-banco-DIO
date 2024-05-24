
public class Main {

    public static void main(String[] args) {


        Cliente nomeCliente = new Cliente();
        nomeCliente.setNome("Ana Hickmann");

        Conta cc = new ContaCorrente(nomeCliente);
        Conta poupanca = new ContaPoupanca(nomeCliente);

        cc.depositar(4000);
        cc.transferir(3000, poupanca);
        cc.sacar(500);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}