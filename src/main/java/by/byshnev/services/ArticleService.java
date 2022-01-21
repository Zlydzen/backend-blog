package by.byshnev.services;

import by.byshnev.dao.ArticleDAO;
import by.byshnev.dto.ArticleDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService implements ArticleDAO {

    @Value("classpath:articles.json")
    Resource getFile;

    private final ObjectMapper objectMapper;
    public ArticleService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public List<ArticleDto> allArticles() {
        List<ArticleDto> list = new ArrayList<>();
        try {
            InputStream inputStream = getFile.getInputStream();
            objectMapper.findAndRegisterModules(); // without it -> InvalidDefinitionException: Java 8 date/time type `java.time.LocalDate` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling
            TypeReference<List<ArticleDto>> typeReference = new TypeReference<List<ArticleDto>>() {};
            list = objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        return list;
    }
}
