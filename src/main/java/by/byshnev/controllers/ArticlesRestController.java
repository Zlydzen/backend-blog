package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ArticleDto> getById(@PathVariable("id") int id) {
        ArticleDto byId = articleService.getById(id);
        return byId != null ? ResponseEntity.ok(byId) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
