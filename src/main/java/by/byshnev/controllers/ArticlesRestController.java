package by.byshnev.controllers;

import by.byshnev.dto.ArticleDTO;
import by.byshnev.models.Article;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
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

    private final String PATH = "/Users/Nikitos/Desktop/backend-blog/src/main/resources/articles.json";

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDTO> restArticle() {
        List<ArticleDTO> articleList = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.findAndRegisterModules();  // Java 8 date/time type `java.time.LocalDate` not supported by default
            InputStream inputStream = new FileInputStream(new File(PATH));
            TypeReference<List<ArticleDTO>> typeReference = new TypeReference<List<ArticleDTO>>() {};
            articleList = objectMapper.readValue(inputStream,typeReference);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return articleList;
    }
}

