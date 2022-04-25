package by.byshnev.services;

import by.byshnev.dto.ArticleDto;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<ArticleDto> getArticles();
    Optional<ArticleDto> getById(int id);
    void create(ArticleDto articleDto);
    ArticleDto update(ArticleDto articleDto, int id);
}
