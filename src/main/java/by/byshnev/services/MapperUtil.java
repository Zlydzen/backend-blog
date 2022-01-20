package by.byshnev.services;

import by.byshnev.dto.ArticleDto;
import by.byshnev.models.ArticleEntity;
import org.springframework.stereotype.Service;

@Service
public class MapperUtil {

    public ArticleDto mapToArticleDto(ArticleEntity entity) {
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

    public ArticleEntity mapToArticle(ArticleDto dto) {
        ArticleEntity entity = new ArticleEntity();
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
