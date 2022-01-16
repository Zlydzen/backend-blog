package by.byshnev.services;

import by.byshnev.dto.ArticleDto;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    @Value("articles.json")
    Resource getFile;

    public List<ArticleDto> getAllArticles() {
        ObjectMapper mapper = new ObjectMapper();
        List<ArticleDto> list = new ArrayList<>();
        TypeReference<List<ArticleDto>> typeReference = new TypeReference<List<ArticleDto>>() {};
        try {
            list = mapper.readValue((JsonParser) getFile, typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

//            try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.findAndRegisterModules();  // Java 8 date/time type `java.time.LocalDate` not supported by default
//            InputStream inputStream = new FileInputStream(new File(getPATH));
//            TypeReference<List<ArticleDto>> typeReference = new TypeReference<List<ArticleDto>>() {};
//            articleList = objectMapper.readValue(inputStream, typeReference);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return articleList;

