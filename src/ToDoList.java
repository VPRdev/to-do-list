import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Tarefa> tarefas;

    public ToDoList() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas(boolean mostrarConcluidas) {
        boolean encontrou = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida() == mostrarConcluidas) {
                tarefa.exibirTarefa();
                System.out.println("----------------------------");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma tarefa " + (mostrarConcluidas ? "concluída." : "pendente."));
        }
    }

    public boolean concluirTarefa(String titulo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo) && !tarefa.isConcluida()) {
                tarefa.marcarComoConcluida();
                return true;
            }
        }
        return false;
    }
}
