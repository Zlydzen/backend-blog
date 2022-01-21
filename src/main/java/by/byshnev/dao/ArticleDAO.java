package by.byshnev.dao;

import by.byshnev.dto.ArticleDto;
import java.util.List;

public interface ArticleDAO {
    List<ArticleDto> allArticles();
}
