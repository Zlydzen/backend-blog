package by.byshnev.controllers;

import by.byshnev.models.Article;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> restArticle() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Article>> typeReference = new TypeReference<List<Article>>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/Users/Nikitos/Desktop/backend-blog/src/main/resources/articles.json");
        List<Article> articleList = objectMapper.readValue(inputStream, typeReference);
        return articleList;
    }
}

