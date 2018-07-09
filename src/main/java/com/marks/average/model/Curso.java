package com.marks.average.model;

import lombok.Data;

@Data
public class Curso {

    String nome;
    String href;

    public Curso(String nome, String href) {
        this.nome = nome;
        this.href = href;
    }
}
