package by.byshnev.mappers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    ArticleDto toArticleDto(Article article);
}
