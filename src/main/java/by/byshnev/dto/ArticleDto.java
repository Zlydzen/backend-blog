package by.byshnev.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleDto {
    private int id;
    private String title;
    private String shortText;
    private String mainText;
    private String author;
    private LocalDateTime creationDateTime;
    private LocalDateTime updateDateTime;
}
