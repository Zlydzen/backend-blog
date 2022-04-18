package by.byshnev.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleDto {
    private int id;
    private String title;
    private String shortText;
    private String mainText;
    private String author;
    private Date creationDateTime;
    private Date updateDateTime;
}
