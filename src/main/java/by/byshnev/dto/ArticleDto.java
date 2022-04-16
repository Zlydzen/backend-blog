package by.byshnev.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ArticleDto {
    private Integer id;
    private String title;
    private String shortText;
    private String mainText;
    private String author;
    private LocalDate creationDateTime;
    private LocalDate updateDateTime;
}
