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

    public Article mapToArticle(ArticleDto dto) {
        Article article = new Article();
        article.setId(dto.getId());
        article.setTitle(dto.getTitle());
        article.setShortText(dto.getShortText());
        article.setMainText(dto.getMainText());
        article.setAuthor(dto.getAuthor());
        article.setCreationDateTime(dto.getCreationDateTime());
        article.setUpdateDateTime(dto.getUpdateDateTime());
        return article;
    }

}
