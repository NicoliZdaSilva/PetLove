package br.com.petlove.model;

public class Veterinario extends Pessoa{

    private Long id;
    private String especialidade;

    public Veterinario() {

    }

    public Veterinario (String nome, String cidade, String telefone, String senha, String especialidade){
        super (nome, cidade, telefone, senha);
        this.especialidade = especialidade;
    }

    public Long getId() {
        return id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public boolean setEspecialidade(String especialidade) {
        if (!especialidade.isEmpty()) {
            this.especialidade = especialidade;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidade: " + especialidade;
    }
}
