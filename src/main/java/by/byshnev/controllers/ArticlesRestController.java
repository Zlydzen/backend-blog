package by.byshnev.controllers;

import by.byshnev.models.Article;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ArticlesRestController {

    @RequestMapping(value = "/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Article restArticle(){
        Article article = new Article(1, "First", "First article", "Content of article", "M.Byshniou", new Date(), new Date());
        return article;
    }
}
