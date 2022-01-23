package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import by.byshnev.services.ArticleService;
import by.byshnev.services.Mapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    private final ArticleService articleService;

    private final Mapper mapper;

    public ArticlesRestController(ArticleService articleService, Mapper mapper) {
        this.articleService = articleService;
        this.mapper = mapper;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> getAllArticles() {
        return articleService.allArticles()
                .stream()
                .map(mapper::mapToArticleDto)
                .collect(toList());
    }
}
