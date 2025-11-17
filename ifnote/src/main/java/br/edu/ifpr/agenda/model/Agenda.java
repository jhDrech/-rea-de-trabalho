package br.edu.ifpr.agenda.model;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    final static Scanner sc = new Scanner(System.in);

    private ArrayList<Tarefa> tarefas;
    private ArrayList<Post> posts;
    private ArrayList<Subpost> subPosts;

    public void mostrarTarefas(ArrayList<Tarefa> agenda){
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public void criarTarefa(ArrayList<Tarefa> tarefas){
        System.out.println("Insira o nome da nova tarefa:");
        String nome = sc.nextLine();
        System.out.println("Insira a descrição da tarefa");
        String descricao = sc.nextLine();
        
    }
}
