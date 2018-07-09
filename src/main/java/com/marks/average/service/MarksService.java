package com.marks.average.service;


import com.marks.average.model.Curso;
import com.marks.average.model.UnidadeCurricular;
import com.marks.average.scrapper.MarksScrapper;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public class MarksService {

    @Autowired
    private MarksScrapper marksScrapper;

    private ArrayList<Curso> cursos;
    private ArrayList<UnidadeCurricular> ucs;
    int i = 0;


    public ArrayList<Curso> getCursos() {

        cursos = new ArrayList<>();

        for (Element e : marksScrapper.getCursosList()
                ) {
            if (!e.attr("title").isEmpty())
                cursos.add(new Curso(e.attr("title"), e.attr("href")));
        }

        return cursos;
    }


    public ArrayList<UnidadeCurricular> getUcs() {

        ucs = new ArrayList<>();

        for (Map.Entry<String, String> entry : marksScrapper.getUcsList().entrySet())
        {
            ucs.add(new UnidadeCurricular(entry.getKey(),entry.getValue()));
        }

        return ucs;
    }

}
