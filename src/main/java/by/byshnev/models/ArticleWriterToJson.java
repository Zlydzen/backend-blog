package by.byshnev.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArticleWriterToJson {

    public static void main(String[] args) throws IOException, ParseException {
        ArticleWriterToJson articleWriterToJson = new ArticleWriterToJson();
        articleWriterToJson.writerToJsonFile();
    }

    public void writerToJsonFile() throws IOException {
        List<Article> articleList = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule())
                .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        Article article1 = new Article();
        article1.setID(1);
        article1.setTitle("Some title");
        article1.setShortText("Some short text");
        article1.setMainText("Some main text");
        article1.setAuthor("Some author");
        article1.setCreationDateTime(LocalDate.parse("1989-05-19"));
        article1.setUpdateDateTime(LocalDate.now());
        Article article2 = new Article();
        article2.setTitle("Some title2");
        article2.setShortText("Some short text2");
        article2.setMainText("Some main text2");
        article2.setAuthor("Some author2");
        article2.setCreationDateTime(LocalDate.parse("1989-05-19"));
        article2.setUpdateDateTime(LocalDate.now());
        articleList.add(article1);
        articleList.add(article2);


        String PATH = "/Users/Nikitos/Desktop/backend-blog-main/backend-blog/src/main/resources/articles.json";
        objectMapper.writeValue(new File(PATH), articleList);
    }
}
