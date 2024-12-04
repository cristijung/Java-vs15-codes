package partetres.collections.exsimples;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {

        LinkedList<String> tarefas = new LinkedList<>();

        //add
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Ler um livro");

        //exibindo
        System.out.println("Tarefas na lista: " + tarefas);

        //add
        tarefas.addFirst("Tomar café da manhã");
        System.out.println("Depois de adicionar uma tarefa no início: " + tarefas);

        //add tarefa no final
        tarefas.addLast("Dormir");
        System.out.println("Depois de adicionar uma tarefa no final: " + tarefas);

        //remover
        tarefas.removeFirst();
        System.out.println("Depois de remover a primeira tarefa: " + tarefas);

        //remover
        tarefas.removeLast();
        System.out.println("Depois de remover a última tarefa: " + tarefas);

        System.out.println("Iterando sobre as tarefas:");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }

        //buscar
        boolean contemExercicios = tarefas.contains("Fazer exercícios");
        System.out.println("A lista contém 'Fazer exercícios'? " + contemExercicios);

        //obter
        int tamanho = tarefas.size();
        System.out.println("Tamanho da lista: " + tamanho);

        //limpar
        tarefas.clear();
        System.out.println("Depois de limpar a lista: " + tarefas);
    }
}
