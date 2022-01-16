package by.byshnev.services;

import by.byshnev.dto.ArticleDto;
import by.byshnev.models.Article;
import org.springframework.stereotype.Service;

@Service
public class MapperUtil {

    public ArticleDto mapToArticleDto(Article article) {
        ArticleDto dto = new ArticleDto();
    dto.setId(article.getId());
    dto.setTitle(article.getTitle());
    dto.setShortText(article.getShortText());
    dto.setMainText(article.getMainText());
    dto.setAuthor(article.getAuthor());
    dto.setCreationDateTime(article.getCreationDateTime());
    dto.setUpdateDateTime(article.getUpdateDateTime());
    return dto;
    }
}
