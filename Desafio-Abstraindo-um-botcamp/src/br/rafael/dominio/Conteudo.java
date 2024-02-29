package br.rafael.dominio;

import java.time.LocalDate;

public abstract class Conteudo {

    protected static final Double xp_padrao = 10d;

    private String titulo;
    private String descricao;
    private LocalDate data; // Mentoria
    private int cargaHoraria; // curso

    public abstract Double calcular_Xp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


}
