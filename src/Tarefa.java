public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private boolean concluida;

    public Tarefa (String titulo, String descricao, String prazo){
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.concluida = concluida;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public boolean isConcluida(){
        return concluida;
    }

    public void marcarComoConcluida(){
        this.concluida = true;
    }

    public void exibirTarefa(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Status: " + (concluida ? "Concluida" : "Pendente"));

    }
}
