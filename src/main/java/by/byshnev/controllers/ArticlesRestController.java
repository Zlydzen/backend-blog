package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesRestController {


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> getAllArticles() {
        return null;
    }
}

//        public List<ArticleDto> getAllArticles() {
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.findAndRegisterModules();  // Java 8 date/time type `java.time.LocalDate` not supported by default
//            InputStream inputStream = new FileInputStream(new File(getPATH));
//            TypeReference<List<ArticleDto>> typeReference = new TypeReference<List<ArticleDto>>() {};
//            articleList = objectMapper.readValue(inputStream, typeReference);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return articleList;

