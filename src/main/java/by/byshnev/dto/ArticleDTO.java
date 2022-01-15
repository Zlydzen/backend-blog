package by.byshnev.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ArticleDTO {
    private int ID;
    private String Title;
    private String shortText;
    private String mainText;
    private String author;
    private LocalDate creationDateTime;
    private LocalDate updateDateTime;
}
