package by.byshnev.services;

import by.byshnev.models.Article;
import by.byshnev.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    @Override
    public Article getArticle() {
        return null;
    }
}
