package by.byshnev.services;

import by.byshnev.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> getArticles();
    ArticleDto getById(int id);
    void create(ArticleDto articleDto);
}
