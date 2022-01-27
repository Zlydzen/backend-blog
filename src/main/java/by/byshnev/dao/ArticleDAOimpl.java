package by.byshnev.dao;

import by.byshnev.entities.Article;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ArticleDAOimpl implements ArticleDAO {

    private final ObjectMapper objectMapper;

    @Value("classpath:article.json")
    Resource file;

    @Override
    public List<Article> allArticles() {
        List<Article> list = new ArrayList<>();
        try {
            InputStream inputStream = file.getInputStream();
            TypeReference<List<Article>> typeReference = new TypeReference<List<Article>>() {};
            list = objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return list;
    }
}

