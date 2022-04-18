package by.byshnev.mappers;

import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    ArticleDto toArticleDto(Article article);
    List<ArticleDto> toListArticleDto(List<Article> articles);
    Article toArticleEntity(ArticleDto articleDto);
}
