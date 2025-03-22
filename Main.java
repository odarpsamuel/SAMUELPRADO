import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorAtividades gerenciador = new GerenciadorAtividades();

        while (true) {
            System.out.println("\nGerenciador de Atividades");
            System.out.println("1. Adicionar Atividade");
            System.out.println("2. Remover Atividade");
            System.out.println("3. Marcar Atividade como Concluída");
            System.out.println("4. Listar Atividades");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da atividade: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarAtividade(descricao);
                    System.out.println("Atividade adicionada com sucesso!");
                    break;
                case 2:
                    gerenciador.listarAtividades();
                    System.out.print("Digite o número da atividade para remover: ");
                    int indexRemover = scanner.nextInt() - 1;
                    gerenciador.removerAtividade(indexRemover);
                    break;
                case 3:
                    gerenciador.listarAtividades();
                    System.out.print("Digite o número da atividade para marcar como concluída: ");
                    int indexConcluir = scanner.nextInt() - 1;
                    gerenciador.marcarAtividadeComoConcluida(indexConcluir);
                    break;
                case 4:
                    gerenciador.listarAtividades();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
