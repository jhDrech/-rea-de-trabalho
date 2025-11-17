package br.edu.ifpr.agenda.model;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    final static Scanner sc = new Scanner(System.in);

    private ArrayList<Tarefa> tarefas;
    private ArrayList<Post> posts;
    private ArrayList<Subpost> subPosts;

    public void mostrarTarefas(ArrayList<Tarefa> tarefas){
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public void criarTarefa(ArrayList<Tarefa> tarefas){
        Tarefa tarefa = new Tarefa();
        System.out.println("Insira o nome da nova tarefa:");
        tarefa.setNome(sc.nextLine()); 
        System.out.println("Insira a descrição da tarefa:");
        tarefa.setDescricao(sc.nextLine());
        System.out.println("Qual é a data de conclusão?");
        tarefa.setDataOut(sc.nextInt());
        //colocar data de início
        tarefas.add(tarefa);
    }

    public void deletartarefa(String nome, ArrayList<Tarefa> tarefas){
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getNome() == nome){
                tarefas.remove(tarefa.getTarefaId());
            }
        }
    }

    public void editarTarefa(String nome, ArrayList<Tarefa> tarefas){
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getNome() == nome){
                System.out.println("Qual o novo nome da tarefa?");
                tarefa.setNome(sc.nextLine());
                System.out.println("Qual a descrição?(se for a mesma mantenha vazio)");
                String des = sc.nextLine();
                if(des != null){
                    tarefa.setDescricao(des);
                }
            }
        }
    }
    
}
