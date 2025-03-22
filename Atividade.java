public class Atividade {
    private String descricao;   // A descrição da atividade
    private boolean concluida;  // Status se a atividade foi concluída ou não

    // Construtor da classe Atividade
    public Atividade(String descricao) {
        this.descricao = descricao;
        this.concluida = false;  // Por padrão, a atividade começa como não concluída
    }

    // Getter para obter a descrição da atividade
    public String getDescricao() {
        return descricao;
    }

    // Getter para verificar se a atividade está concluída
    public boolean isConcluida() {
        return concluida;
    }

    // Método para marcar a atividade como concluída
    public void marcarComoConcluida() {
        this.concluida = true;
    }

    // Método toString para exibir a descrição e status da atividade
    @Override
    public String toString() {
        return descricao + (concluida ? " - Concluída" : " - Pendente");
    }
}
