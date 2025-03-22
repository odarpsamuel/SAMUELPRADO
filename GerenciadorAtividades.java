import java.util.ArrayList;
public class GerenciadorAtividades {
    private ArrayList<Atividade> atividades;

    public GerenciadorAtividades() {
        atividades = new ArrayList<>();
    }

    public void adicionarAtividade(String descricao) {
        atividades.add(new Atividade(descricao));
    }

    public boolean removerAtividade(int index) {
        if (index >= 0 && index < atividades.size()) {
            Atividade atividade = atividades.get(index);
            if (atividade.isConcluida()) {
                System.out.println("Erro: Não é possível remover uma atividade concluída!");
                return false;
            } else {
                atividades.remove(index);
                return true;
            }
        }
        return false;
    }

    public boolean marcarAtividadeComoConcluida(int index) {
        if (index >= 0 && index < atividades.size()) {
            Atividade atividade = atividades.get(index);
            if (atividade.isConcluida()) {
                System.out.println("Erro: A atividade já está concluída!");
                return false;
            } else {
                atividade.marcarComoConcluida();
                return true;
            }
        }
        return false;
    }

    public void listarAtividades() {
        if (atividades.isEmpty()) {
            System.out.println("Nenhuma atividade cadastrada.");
        } else {
            for (int i = 0; i < atividades.size(); i++) {
                System.out.println(i + 1 + ". " + atividades.get(i));
            }
        }
    }
}
