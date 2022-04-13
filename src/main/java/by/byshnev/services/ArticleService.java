package by.byshnev.services;

import by.byshnev.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> getAllArticles();
    ArticleDto addOne(ArticleDto articleDto);
    ArticleDto getById(int id);
}
