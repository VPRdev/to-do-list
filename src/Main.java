import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList lista = new ToDoList();

        while (true) {
            System.out.println("### GERENCIADOR DE TAREFAS ###");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas Pendentes");
            System.out.println("3. Listar Tarefas Concluídas");
            System.out.println("4. Marcar Tarefa como Concluída");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite o prazo da tarefa: ");
                    String prazo = scanner.nextLine();

                    Tarefa novaTarefa = new Tarefa(titulo, descricao, prazo);
                    lista.adicionarTarefa(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("Tarefas Pendentes:");
                    lista.listarTarefas(false);
                    break;

                case 3:
                    System.out.println("Tarefas Concluídas:");
                    lista.listarTarefas(true);
                    break;

                case 4:
                    System.out.print("Digite o título da tarefa a ser concluída: ");
                    titulo = scanner.nextLine();
                    if (lista.concluirTarefa(titulo)) {
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Tarefa não encontrada ou já concluída.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
