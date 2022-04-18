package by.byshnev.dao;

import by.byshnev.entities.Article;
import by.byshnev.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Configuration
public class ArticleDAOImpl {

    @Value("classpath:articles.json")
    Resource file;
    private final ArticleRepository articleRepository;

    public ArticleDAOImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }
    public Article getById(int id){
        return articleRepository.getById(id);
    }
    public void create(Article article){
        articleRepository.save(article);
    }
}