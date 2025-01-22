package br.com.petlove.model;

public class Funcionario extends Pessoa {

    private Long id;

    public Funcionario() {

    }

    public Long getId() {
        return id;
    }

    public Funcionario (String nome, String cidade, String telefone, String senha) {
        super (nome, cidade, telefone, senha);
    }
}
