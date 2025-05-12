import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    String titulo;
    String autor;

    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== Biblioteca ===");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Remover livro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    livros.add(new Livro(titulo, autor));
                    break;
                case 2:
                    System.out.println("\nLivros cadastrados:");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println(i + " - " + livros.get(i).titulo + " (Autor: " + livros.get(i).autor + ")");
                    }
                    break;
                case 3:
                    System.out.print("Informe o índice do livro a remover: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < livros.size()) {
                        livros.remove(indice);
                        System.out.println("Livro removido.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
