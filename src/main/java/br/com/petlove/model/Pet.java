package br.com.petlove.model;

public class Pet {

    private String nome;
    private String dataNascimento;
    private String tipo;

    public Pet() {

    }

    public Pet (String nome, String dataNascimento, String tipo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public boolean setDataNascimento(String dataNascimento) {
        if (!dataNascimento.isEmpty()) {
            this.dataNascimento = dataNascimento;
            return true;
        }
        return false;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
        if (!tipo.isEmpty()) {
            this.tipo = tipo;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Tipo: " + tipo;
    }
}