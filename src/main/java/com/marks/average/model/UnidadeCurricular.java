package com.marks.average.model;

import lombok.Data;

@Data
public class UnidadeCurricular {

    private String nome;
    private String ects;


    public UnidadeCurricular(String nome, String ects) {
        this.nome = nome;
        this.ects = ects;
    }

    public UnidadeCurricular(String nome) {
        this.nome = nome;
    }
}
