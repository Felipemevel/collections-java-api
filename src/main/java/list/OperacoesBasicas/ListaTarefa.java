package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {


    //cria a lista de tarefas
    private List<Tarefa> tarefaList;


    //sempre que chamar a ListaTarefa cria um array list vazio
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }


    //adiciona uma nova tarefa a partir de uma nova descrição
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }


    //Cria um arraylist para as tarefas que vão ser removidas. Então pega todas as tarefas de mesma descrição e coloca dentro do arraylist de tarefasParaRemover, feito isso é chamado o removeall de tarefasParaRemover
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    //Obtem o tamanho do arraylist de tarefalist
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    //Obtem a descrição da tarefa
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
