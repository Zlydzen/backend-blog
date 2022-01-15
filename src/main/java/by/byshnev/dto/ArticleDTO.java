package by.byshnev.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ArticleDTO {
    private int ID;
    private String Title;
    private String shortText;
    private String mainText;
    private String author;
    private LocalDate creationDateTime;
    private LocalDate updateDateTime;
}
