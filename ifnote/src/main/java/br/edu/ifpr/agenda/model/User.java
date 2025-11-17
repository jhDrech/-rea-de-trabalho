package br.edu.ifpr.agenda.model;

public class User {
    private String nome;
    private String email;
    private int nascimento;
    private int userId;
    private String username;
    public User() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNascimento() {
        return nascimento;
    }
    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

}
