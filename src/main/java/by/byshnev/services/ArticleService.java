package by.byshnev.services;

import by.byshnev.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> getArticles();
    void create(ArticleDto articleDto);
    ArticleDto getById(int id);
}
