package by.byshnev.models;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Article {

    private int ID;
    private String Title;
    private String shortText;
    private String mainText;
    private String author;
    private Date creationDateTime;
    private Date updateDateTime;

    public Article(int ID, String title, String shortText, String mainText, String author, Date creationDateTime, Date updateDateTime) {
        this.ID = ID;
        Title = title;
        this.shortText = shortText;
        this.mainText = mainText;
        this.author = author;
        this.creationDateTime = creationDateTime;
        this.updateDateTime = updateDateTime;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    {
        List<Article> articleList = new ArrayList<>();
        articleList.add(new Article(1, "First", "First article", "Content of article", "M.Byshniou", new Date(), new Date()));
        articleList.add(new Article(2, "Second", "Second article", "Phone dependency is evil", "M.McKenzy", new Date(), new Date()));
        articleList.add(new Article(3, "Some title", "Interesting article", "Cars are very popular", "R.Johnson", new Date(), new Date()));

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("resources/articles.json"), articleList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
