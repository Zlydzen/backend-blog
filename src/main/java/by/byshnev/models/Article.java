package by.byshnev.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private long ID;
    private String Title;
    private String shortText;
    private String mainText;
    private String author;
    private LocalDate creationDateTime;
    private LocalDate updateDateTime;

    public Article(int ID, String title, String shortText, String mainText, String author, LocalDate creationDateTime, LocalDate updateDateTime) {
        this.ID = ID;
        Title = title;
        this.shortText = shortText;
        this.mainText = mainText;
        this.author = author;
        this.creationDateTime = creationDateTime;
        this.updateDateTime = updateDateTime;
    }

    public Article(){}

    public long getID() {
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

    public LocalDate getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDate creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public LocalDate getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDate updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    

}