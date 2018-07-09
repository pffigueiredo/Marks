package com.marks.average.scrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class MarksScrapper {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Document document;
    private final String urlCourses = "https://www.ipleiria.pt/cursos/course/type/licenciatura/";
    private final String urlUcs = "https://www.ipleiria.pt/cursos/course/licenciatura-em-engenharia-informatica/";



    public List<Element> getCursosList() {

        List<Element> elementList = getDocument(urlCourses).getElementsByClass("block");

        return elementList;
    }

    public List<Element> getUcsNames() {

        List<Element> elementList = getDocument(urlUcs).getElementsByClass("curricular_plan_cu_title");

        return elementList;
    }

    public List<Element> getUcsEcts() {

        List<Element> elementList = getDocument(urlUcs).getElementsByClass("curricular_plan_cu_ects");

        return elementList;
    }

    public Map<String, String> getUcsList() {

        List<Element> elementListNames = getDocument(urlUcs).getElementsByClass("curricular_plan_cu_title");
        List<Element> elementListEcts = getDocument(urlUcs).getElementsByClass("curricular_plan_cu_ects");

        Map<String, String> map = new LinkedHashMap<String, String>();  // ordered

        for (int i = 0; i < elementListEcts.size(); i++) {
            if (elementListNames.get(i).text().compareTo("Curricular Unit") != 0)
                map.put(elementListNames.get(i).text(), elementListEcts.get(i).text());    // is there a clearer way?
        }

        return map;
    }


    public Document getDocument(String url) {
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            final String error = String.format("Cannot retrieve web document from URL: %s", url);

            logger.error(error);
            throw new IllegalStateException(error);
        }
        return document;
    }


}
