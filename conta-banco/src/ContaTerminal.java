import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência!: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da Conta!: ");
        int conta = scanner.nextInt();

        scanner.nextLine(); // Consome a quebra de linha residual

        System.out.print("Por favor, digite seu nome de cliente!: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite seu saldo!: ");
        String saldoInput = scanner.next();
        float saldo = Float.parseFloat(saldoInput.replace(",", "."));

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque.");
        scanner.close();
    }
}
