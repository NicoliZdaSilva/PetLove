package br.com.petlove.model;

public class Pet {

    private Long id;
    private String nome;
    private String dataNascimento;
    private String tipo;
    private String raca;

    public Pet() {

    }

    public Pet (String nome, String dataNascimento, String tipo, String raca) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipo = tipo;
        this.raca = raca;
    }

    public Pet(String nome, String dataNascimento, String tipo, String raca, long id) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipo = tipo;
        this.raca = raca;
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public String getRaca() {
        return raca;
    }

    public boolean setRaca(String raca) {
        if (!raca.isEmpty()) {
            this.raca = raca;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Tipo: " + tipo + ", Raça: " + raca;
    }
}