package by.byshnev.entities;

import lombok.Data;

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

    @Column(name = "shorttext")
    private String shortText;

    @Column(name = "maintext")
    private String mainText;

    @Column(name = "author")
    private String author;

    @Column(name = "creationdatetime")
    private LocalDate creationDateTime;

    @Column(name = "updatedatetime")
    private LocalDate updateDateTime;
}