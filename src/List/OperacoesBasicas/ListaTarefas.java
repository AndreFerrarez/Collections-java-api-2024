package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Total de tarefas " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa numero 1");
        listaTarefas.adicionarTarefa("Tarefa numero 2");
        listaTarefas.adicionarTarefa("Tarefa numero 3");
        listaTarefas.adicionarTarefa("Tarefa numero 4");
        listaTarefas.adicionarTarefa("Tarefa numero 5");
        listaTarefas.adicionarTarefa("Tarefa numero 6");
        System.out.println("Total de tarefas" + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricaoTarefas();

        listaTarefas.removerTarefa("Tarefa numero 1");
        listaTarefas.removerTarefa("Tarefa numero 2");
        listaTarefas.removerTarefa("Tarefa numero 3");
        listaTarefas.removerTarefa("Tarefa numero 4");
        System.out.println("Total de tarefas " + listaTarefas.obterNumeroTotalTarefas());
    }
}
