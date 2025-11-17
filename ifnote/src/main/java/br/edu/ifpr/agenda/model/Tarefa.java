package br.edu.ifpr.agenda.model;

public class Tarefa {
    private int tarefaId;    
    private String nome;    
    private String descricao;    
    private int dataIn;    
    private int dataOut;    
    private int userId;
    public Tarefa() {
    }
    public int getTarefaId() {
        return tarefaId;
    }
    public void setTarefaId(int tarefaId) {
        this.tarefaId = tarefaId;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getDataIn() {
        return dataIn;
    }
    public void setDataIn(int dataIn) {
        this.dataIn = dataIn;
    }
    public int getDataOut() {
        return dataOut;
    }
    public void setDataOut(int dataOut) {
        this.dataOut = dataOut;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }    
}
