package br.com.petlove.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {

    private Long id;
    private LocalDate data;
    private LocalTime hora;
    private Veterinario veterinario;
    private Dono dono;
    private Pet pet;
    private double valor;
    private String descricao;

    public Consulta() {

    }

    public Consulta(LocalDate data, LocalTime hora, Veterinario veterinario, Dono dono, Pet pet, double valor, String descricao) {
        this.data = data;
        this.hora = hora;
        this.veterinario = veterinario;
        this.dono = dono;
        this.pet = pet;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean setData(LocalDate data) {
        if (data != null) {
            this.data = data;
            return true;
        }
        return false;
    }

    public LocalTime getHora() {
        return hora;
    }

    public boolean setHora(LocalTime hora) {
        if (hora != null) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public boolean setVeterinario(Veterinario veterinario) {
        if (veterinario != null) {
            this.veterinario = veterinario;
            return true;
        }
        return false;
    }

    public Dono getDono() {
        return dono;
    }

    public boolean setDono(Dono dono) {
        if (dono != null) {
            this.dono = dono;
            return true;
        }
        return false;
    }

    public Pet getPet() {
        return pet;
    }

    public boolean setPet(Pet pet) {
        if (pet != null) {
            this.pet = pet;
            return true;
        }
        return false;
    }

    public double getValor() {
        return valor;
    }

    public boolean setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
            return true;
        }
        return false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean setDescricao(String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Data: " + data + ", Hora: " + hora + ", Veterinário(a): " + veterinario + ", Dono: " + dono + ", Pet: " + pet + ", Valor: " + valor + ", Descrição: " + descricao;
    }
}
