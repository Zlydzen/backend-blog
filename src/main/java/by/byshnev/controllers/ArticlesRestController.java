package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.mappers.ArticleMapper;
import by.byshnev.services.ArticleService;
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

    private final ArticleService articleService;

    private final ArticleMapper articleMapper;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> getAllArticles() {
        return articleMapper.toListArticleDto(articleService.allArticles());
    }
}
