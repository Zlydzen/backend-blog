package by.byshnev.services;

import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;

public class Mapper {

    public ArticleDto mapToArticleDto(Article entity) {
        ArticleDto dto = new ArticleDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setShortText(entity.getShortText());
        dto.setMainText(entity.getMainText());
        dto.setAuthor(entity.getAuthor());
        dto.setCreationDateTime(entity.getCreationDateTime());
        dto.setUpdateDateTime(entity.getUpdateDateTime());
        return dto;
    }

    public Article mapToArticle(ArticleDto dto) {
        Article entity = new Article();
        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setShortText(dto.getShortText());
        entity.setMainText(dto.getMainText());
        entity.setAuthor(dto.getAuthor());
        entity.setCreationDateTime(dto.getCreationDateTime());
        entity.setUpdateDateTime(dto.getUpdateDateTime());
        return entity;
    }
}
