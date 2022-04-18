package by.byshnev.dao;

import by.byshnev.entities.Article;
import by.byshnev.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }
    public Article getById(int id){
        return articleRepository.getById(id);
    }
    public void create(Article article){
        Article newArticle = new Article();
        newArticle.setTitle(article.getTitle());
        newArticle.setShortText(article.getShortText());
        newArticle.setMainText(article.getMainText());
        newArticle.setAuthor(article.getAuthor());
        newArticle.setCreationDateTime(article.getCreationDateTime());
        newArticle.setUpdateDateTime(article.getUpdateDateTime());
        articleRepository.save(newArticle);
    }
}