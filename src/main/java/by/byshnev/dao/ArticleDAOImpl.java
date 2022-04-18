package by.byshnev.dao;

import by.byshnev.entities.Article;
import by.byshnev.repositories.ArticleRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
@Configuration
public class ArticleDAOImpl {

    @Value("classpath:articles.json")
    Resource file;

    private final ObjectMapper objectMapper;
    private ArticleRepository articleRepository;

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