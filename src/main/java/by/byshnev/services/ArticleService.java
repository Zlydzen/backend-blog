package by.byshnev.services;

import by.byshnev.dao.ArticleDAO;
import by.byshnev.entities.Article;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService implements ArticleDAO {

    @Value("classpath:articles.json")
    Resource getFile;

    private final ObjectMapper objectMapper;

    @Override
    public List<Article> allArticles() {
        List<Article> list = new ArrayList<>();
        try {
            InputStream inputStream = getFile.getInputStream();
            TypeReference<List<Article>> typeReference = new TypeReference<List<Article>>() {};
            list = objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        return list;
    }
}
