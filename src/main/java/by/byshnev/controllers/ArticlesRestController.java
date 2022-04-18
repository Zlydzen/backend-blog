package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    private final ArticleService articleService;
    @GetMapping
    public ResponseEntity<List<ArticleDto>> getArticles() {
        return ResponseEntity.ok(articleService.getArticles());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ArticleDto> getOne(@PathVariable(name = "id") int id) {
        ArticleDto byId = articleService.getById(id);
        return byId != null ? new ResponseEntity<>(byId, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/new")
    public ResponseEntity<?> createArticle(@RequestBody ArticleDto articleDto) {
        articleService.create(articleDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}