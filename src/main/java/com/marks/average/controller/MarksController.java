package com.marks.average.controller;

import com.marks.average.model.Curso;
import com.marks.average.model.UnidadeCurricular;
import com.marks.average.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MarksController {


    @Autowired
    MarksService marksService;

    @GetMapping("/teste")
    private ArrayList<Curso> teste(){
        return marksService.getCursos();
        //return "oi";
    }


    @GetMapping("/teste1")
    private ArrayList<UnidadeCurricular> teste1(){
        return marksService.getUcs();
        //return "oi";
    }
}
