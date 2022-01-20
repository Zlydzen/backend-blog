package by.byshnev.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class ArticleEntity {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String shortText;
    private String mainText;
    private String author;
    private LocalDate creationDateTime;
    private LocalDate updateDateTime;

}