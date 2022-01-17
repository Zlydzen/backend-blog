package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.services.ArticleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    private final ArticleService articleService;

    public ArticlesRestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> getAllArticles() {
        return articleService.allArticles();
    }
}
