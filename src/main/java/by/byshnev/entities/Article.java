package by.byshnev.entities;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "article")
public class Article {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "short_text")
    private String shortText;

    @Column(name = "main_text")
    private String mainText;

    @Column(name = "author")
    private String author;

    @CreatedDate
    @Column(name = "creation_date_time")
    private LocalDate creationDateTime;

    @UpdateTimestamp
    @Column(name = "update_date_time")
    private LocalDate updateDateTime;
}