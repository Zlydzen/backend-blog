package by.byshnev.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

    private String title;

    @Column(name = "short_text")
    private String shortText;

    @Column(name = "main_text")
    private String mainText;

    @Column(name = "author")
    private String author;

    @CreationTimestamp
    private LocalDateTime creationDateTime = LocalDateTime.now();

    @UpdateTimestamp
    private LocalDateTime updateDateTime;
}