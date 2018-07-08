package com.marks.average.model;

import lombok.Data;

@Data
public class Curso {

    String nome;

    public Curso(String nome) {
        this.nome = nome;
    }
}
