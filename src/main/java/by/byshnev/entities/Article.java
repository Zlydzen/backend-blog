package by.byshnev.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "articles")
public class Article {

    @Id
    @Column(name = "id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "short_text")
    private String shortText;

    @Column(name = "main_text")
    private String mainText;

    @Column(name = "author")
    private String author;

    @Column(name = "creation_date_time")
    private LocalDate creationDateTime;

    @Column(name = "update_date_time")
    private LocalDate updateDateTime;
}