import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        int opcao;

        do {
            System.out.println("\n=== Caixa Eletrônico ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Valor para depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    break;
                case 3:
                    System.out.print("Valor para sacar: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
            }
        } while (opcao != 0);

        System.out.println("Encerrando...");
        scanner.close();
    }
}
