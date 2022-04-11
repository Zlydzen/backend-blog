package by.byshnev.services;

import by.byshnev.dto.ArticleDto;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    List<ArticleDto> getAllArticles();
    Optional <ArticleDto> getById(int id);
}
