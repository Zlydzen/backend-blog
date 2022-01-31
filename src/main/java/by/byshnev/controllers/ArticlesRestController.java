package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    private final ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArticleDto> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping(value = "/{id}")
    public ArticleDto getById(@PathVariable("id") int id) {
        try {
            return articleService.getById(id);
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND);
        }
    }
}
