package by.byshnev.controllers;

import by.byshnev.models.Article;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> restArticle() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Article article = objectMapper.readValue(new File("/Users/Nikitos/Desktop/backend-blog/src/main/resources/articles.json"), Article.class);
        List<Article> articleList = new ArrayList<>();
        articleList.add(article);
        return articleList;
    }
}

