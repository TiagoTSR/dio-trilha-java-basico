public class Main {

    public static void main(String[] args) {
        Endereco enderecoBanco = new Endereco("Av. Principal", "100", "Cidade X", "Estado Y", "12345-678");
        Banco banco = new Banco("Banco ABC", "001", enderecoBanco);

        Endereco enderecoCliente = new Endereco("Rua das Flores", "50", "Cidade X", "Estado Y", "98765-432");
        Cliente venilton = new Cliente("Venilton", "123.456.789-00", enderecoCliente);

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(500);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
