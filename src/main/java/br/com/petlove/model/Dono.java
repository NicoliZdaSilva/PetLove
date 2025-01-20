package br.com.petlove.model;

import java.util.ArrayList;

public class Dono extends Pessoa{

    private String estado;
    private ArrayList<Pet> pets;

    public Dono() {

    }

    public Dono (String nome, String cidade, String telefone, String estado) {
        super (nome, cidade, telefone, estado);
        this.estado = estado;
        this.pets = new ArrayList<Pet>();
    }

    public String getEstado() {
        return estado;
    }

    public boolean setEstado(String estado) {
        if (!estado.isEmpty() && estado.length() == 2) {
            this.estado = estado;
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString() + ", Estado: " + estado;
    }
}
