package by.byshnev.controllers;

import by.byshnev.models.Article;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> restArticle() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Article> articleList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "/Users/Nikitos/Desktop/backend-blog/src/main/resources/articles.json"));
        while (bufferedReader.ready()) {
            String jsonArticleArray = bufferedReader.readLine();
            articleList = objectMapper.readValue(jsonArticleArray, new TypeReference<>() {
            });
        }
        return articleList;
    }
}

