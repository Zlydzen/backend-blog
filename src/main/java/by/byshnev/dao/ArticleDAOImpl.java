package by.byshnev.dao;

import by.byshnev.entities.Article;
import by.byshnev.repo.ArticleRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ArticleDAOImpl implements ArticleDAO {

    @Value("classpath:articles.json")
    Resource file;

    private final ObjectMapper objectMapper;

    private ArticleRepo articleRepo;

    @Override
    public List<Article> allArticles() {
        return articleRepo.findAll();
    }

    @Override
    public Article getById(int id) {
        return articleRepo.getById(id);
    }

    @Override
    public void createArticle(Article article) {
        articleRepo.save(article);
    }
}