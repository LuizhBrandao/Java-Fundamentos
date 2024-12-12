import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Luiz Brandz";
        String tipoConta = "Conta Corrente";
        double saldo = 1786.33;
        int opcao = 0;

        System.out.println("***********");
        System.out.println("\nNome do Cliente : " + nome);
        System.out.println("Tipo conta " + tipoConta);
        System.out.println("Saldo : " + saldo);
        System.out.println("\n***********");

        String menu = """
                \n*** Digite sua opção ***
                1 -> Consultar Saldo
                2 -> Transferir Valor
                3 -> Receber Valor
                4 -> Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("\nO saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("\nQual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("\nNão há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    // como deixar 2 casas decimais ? String saldo = String.format("%.2f", saldo);
                    System.out.println("\nNovo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("\nValor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("\nNovo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("\nOpção invalida ");

            }
        }

    }
}