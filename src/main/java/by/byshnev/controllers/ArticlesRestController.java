package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping("/articles")
public class ArticlesRestController {

    private final ArticleService articleService;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ArticleDto>> getArticles() {
        return ResponseEntity.ok(articleService.getArticles());
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<ArticleDto> getOne(@PathVariable(name = "id") int id) {
        ArticleDto articleDto = articleService.getById(id)
                .orElseThrow(() -> new EntityNotFoundException("User "+ id + " is not found"));
        return ResponseEntity.ok().body(articleDto);
    }

    @PostMapping(value = "/new", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createArticle(@RequestBody ArticleDto articleDto) {
        articleService.create(articleDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<ArticleDto> updateArticle(@PathVariable("id") int id,
                                                    @RequestBody ArticleDto articleDto){
         articleService.update(articleDto,id);
         return new ResponseEntity<>(HttpStatus.OK);
    }
}