package br.edu.ifrn.sabetodo.dominio;

public class Tarefa {

    private int id;
    private String nome;
    private int qntGirosRoleta;
    private int idEmblema;

    public Tarefa() {

    }
    public Tarefa(int id, String nome, int qntGirosRoleta, int idEmblema){
        this.id = id;
        this.nome = nome;
        this.qntGirosRoleta = qntGirosRoleta;
        this.idEmblema = idEmblema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntGirosRoleta() {
        return qntGirosRoleta;
    }

    public void setQntGirosRoleta(int qntGirosRoleta) {
        this.qntGirosRoleta = qntGirosRoleta;
    }

    public int getIdEmblema() {
        return idEmblema;
    }

    public void setIdEmblema(int idEmblema) {
        this.idEmblema = idEmblema;
    }


}