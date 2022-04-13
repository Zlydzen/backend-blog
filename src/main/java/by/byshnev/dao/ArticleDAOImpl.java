package by.byshnev.dao;

import by.byshnev.entities.Article;
import by.byshnev.repo.ArticleRepo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
    public Article createArticle(Article article) {
        return articleRepo.save(article);
    }
}

//@Override
//    public List<Article> allArticles() {
//        List<Article> list = new ArrayList<>();
//        try {
//            InputStream inputStream = file.getInputStream();
//            TypeReference<List<Article>> typeReference = new TypeReference<List<Article>>() {};
//            list = objectMapper.readValue(inputStream, typeReference);
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("Something wrong...");
//        }
//        return list;
//    }