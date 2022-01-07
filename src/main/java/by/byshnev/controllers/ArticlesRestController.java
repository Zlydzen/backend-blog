package by.byshnev.controllers;

import by.byshnev.models.Article;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticlesRestController {

    @RequestMapping(value = "/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> restArticle() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        List<Article> articleList = new ArrayList<>();

        try {
            articleList.add(new Article(1, "Astronomy", "Astronomy is science",
                    "Astronomy is very interesting science", "A.McKenzy",
                    formatter.parse("10/04/2004"), formatter.parse("11/04/2004")));
            articleList.add(new Article(2, "Biology", "Biology is science",
                    "Biology is very interesting science", "M.Pels",
                    formatter.parse("03/05/2004"), formatter.parse("05/05/2004")));
            articleList.add(new Article(3, "Geography", "Geography is science",
                    "Geography is very interesting science", "A.Kolumb",
                    formatter.parse("01/02/2005"), formatter.parse("06/04/2006")));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Incorrect date");
        }
        return articleList;
    }
}

