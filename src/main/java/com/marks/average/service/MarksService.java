package com.marks.average.service;


import com.marks.average.model.Curso;
import com.marks.average.scrapper.MarksScrapper;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MarksService {

    @Autowired
    private MarksScrapper marksScrapper;

    private final String url = "https://www.ipleiria.pt/cursos/course/type/licenciatura/";
    private ArrayList<Curso> cursos;


    public ArrayList<Curso> getCursos(){

        cursos = new ArrayList<>();

        for (Element e : marksScrapper.getCursosList(url)
             ) {
            if(!e.attr("title").isEmpty())
                cursos.add(new Curso(e.attr("title")));
        }

        return cursos;
    }





}
