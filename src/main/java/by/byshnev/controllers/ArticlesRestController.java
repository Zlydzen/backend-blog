package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.exceptions.NotFoundException;
import by.byshnev.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    private final ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("{id}")
    public Optional<ArticleDto> getById(@PathVariable int id) {
        List<ArticleDto> allArticles = articleService.getAllArticles();
        if (id >= 0 && id < allArticles.size()) {
            return articleService.getById(id);
        } else {
            throw new NotFoundException();
        }
    }
}
