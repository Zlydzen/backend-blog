package by.byshnev.controllers;

import by.byshnev.models.Article;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ArticlesRestController {


    @RequestMapping(value = "/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Article restArticle() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


        Article firstArticle = null;
        try {
            firstArticle = new Article(1, "Astronomy", "Astronomy is science",
                    "Astronomy is very interesting science", "A.McKenzy",
                    formatter.parse("10/04/2004"), formatter.parse("11/04/2004"));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Incorrect date");
        }

        return firstArticle;
    }
}

