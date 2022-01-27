package by.byshnev.controllers;

import by.byshnev.dao.ArticleDAOImpl;
import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import by.byshnev.mappers.ArticleMapper;
import by.byshnev.services.ArticleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    private final ArticleServiceImpl articleServiceImpl;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> getAllArticles() {
        return articleServiceImpl.getAllArticles();
    }
}
