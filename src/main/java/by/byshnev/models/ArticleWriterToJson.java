package by.byshnev.models;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ArticleWriterToJson {

    public static void main(String[] args) throws IOException {
        ArticleWriterToJson articleWriterToJson = new ArticleWriterToJson();
        articleWriterToJson.writerToJsonFile();
    }

    public void writerToJsonFile() throws IOException {
        List<Article> articleList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        ObjectMapper objectMapper = new ObjectMapper();
        Article article = new Article();
        article.setID(1);
        article.setTitle("Some title");
        article.setShortText("Some short text");
        article.setMainText("Some main text");
        article.setAuthor("Some author");
//        article.setCreationDateTime(new Date());
//        article.setUpdateDateTime(new Date());
        articleList.add(article);

        String PATH = "/Users/Nikitos/Desktop/backend-blog-main/backend-blog/src/main/resources/articles.json";
        objectMapper.writeValue(new File(PATH), articleList);
    }
}
