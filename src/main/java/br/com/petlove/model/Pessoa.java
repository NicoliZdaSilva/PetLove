package br.com.petlove.model;

public class Pessoa {

    protected static String nome;
    protected static String cidade;
    protected static String telefone; //Regra 47997551124 - São 11 números
    protected static String senha;

    public Pessoa() {

    }

    public Pessoa(String nome, String cidade, String telefone, String senha) {
        this.nome = nome;
        this.cidade = cidade;
        this.telefone = telefone;
        this.senha = senha;
    }

    public static String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public static String getCidade() {
        return cidade;
    }

    public boolean setCidade(String cidade) {
        if (!cidade.isEmpty()) {
            this.cidade = cidade;
            return true;
        }
        return false;
    }

    public static String getTelefone() {
        return telefone;
    }

    public boolean setTelefone(String telefone) {
        if (!telefone.isEmpty() && telefone.length() == 11) {
            this.telefone = telefone;
            return true;
        }
        return false;
    }

    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {
        if (!senha.isEmpty()) {
            this.senha = senha;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cidade='" + cidade + ", Telefone: " + telefone;
    }
}