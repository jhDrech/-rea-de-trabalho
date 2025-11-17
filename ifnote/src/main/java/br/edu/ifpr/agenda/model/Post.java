package br.edu.ifpr.agenda.model;

public class Post {
    private int postId;
    private int tarefaId;
    private String descricaoPost;
    private int userId;
    public Post() {
    }
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public int getTarefaId() {
        return tarefaId;
    }
    public void setTarefaId(int tarefaId) {
        this.tarefaId = tarefaId;
    }
    public String getDescricaoPost() {
        return descricaoPost;
    }
    public void setDescricaoPost(String descricaoPost) {
        this.descricaoPost = descricaoPost;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
