package com.marks.average.scrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class MarksScrapper {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Document document;


    public List<Element> getCursosList(String url){

        List<Element> elementList = getDocument(url).getElementsByClass("block");

        return elementList;
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
