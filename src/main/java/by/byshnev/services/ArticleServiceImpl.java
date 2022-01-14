package by.byshnev.services;

import by.byshnev.models.Article;
import by.byshnev.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Iterable<Article> getArticleList() {
        return articleRepository.findAll();
    }
}
