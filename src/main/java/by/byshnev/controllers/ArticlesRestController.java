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
    public ResponseEntity<List<ArticleDto>> getAllArticles() {
        List<ArticleDto> allArticles = articleService.getAllArticles();
        return new ResponseEntity<>(allArticles, HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<?> createArticle(@RequestBody ArticleDto articleDto) {
        articleService.addOne(articleDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> getOne(@PathVariable int id) {
        ArticleDto byId = articleService.getById(id);
        return new ResponseEntity<>(byId, HttpStatus.OK);
    }
}