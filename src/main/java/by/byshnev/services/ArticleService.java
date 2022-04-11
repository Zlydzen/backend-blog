package by.byshnev.services;

import by.byshnev.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> getAllArticles();

    void addArticleDto(ArticleDto articleDto);
}