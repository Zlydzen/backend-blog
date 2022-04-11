package by.byshnev.controllers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.exceptions.NotFoundException;
import by.byshnev.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

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
    public ArticleDto getById(@PathVariable int id) {
        List<ArticleDto> allArticles = articleService.getAllArticles();
        if (id >= 0 && id < allArticles.size()) {
            return articleService.getById(id);
        } else {
            throw new NotFoundException();
        }
    }
}
