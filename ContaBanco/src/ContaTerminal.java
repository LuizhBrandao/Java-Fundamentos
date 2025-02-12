import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agência !");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o numero da Conta !");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente !");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo !");
        saldo = scanner.useLocale(Locale.US).nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}