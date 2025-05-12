import java.util.Scanner;

public class SistemaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosA = 0, votosB = 0, opcao;

        do {
            System.out.println("=== Votação ===");
            System.out.println("1 - Votar no Candidato A");
            System.out.println("2 - Votar no Candidato B");
            System.out.println("0 - Encerrar votação");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            if (opcao == 1) votosA++;
            else if (opcao == 2) votosB++;
        } while (opcao != 0);

        System.out.println("\nResultado Final:");
        System.out.println("Candidato A: " + votosA + " votos");
        System.out.println("Candidato B: " + votosB + " votos");

        scanner.close();
    }
}
