package com.marks.average;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AverageMarksController {

    @GetMapping("/teste")
    private String teste(){
        return "teste";
    }
}
