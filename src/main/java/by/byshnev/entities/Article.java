package by.byshnev.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "article")
@JsonIgnoreProperties(value = {"creationDateTime", "updateDateTime"}, allowGetters = true)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(updatable = false)
    private LocalDateTime creationDateTime = LocalDateTime.now();

    @Column(nullable = false)
    @LastModifiedDate
    private LocalDateTime updateDateTime;
}