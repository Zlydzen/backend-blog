package by.byshnev.controllers;

import by.byshnev.models.Article;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ArticlesRestController {


    @RequestMapping(value = "/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> restArticle() {

        return null;
    }
}

