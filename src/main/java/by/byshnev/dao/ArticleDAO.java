package by.byshnev.dao;

import by.byshnev.dto.ArticleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleDAO {
    List<ArticleDto> allArticles();
}
