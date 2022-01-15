package by.byshnev.mappers;

import by.byshnev.dto.ArticleDTO;
import by.byshnev.models.Article;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ArticleMapper {

    @Mapping(target = "articleDTO.id", source = "id")
    @Mapping(target = "articleDTO.title", source = "title")
    @Mapping(target = "articleDTO.shortText", source = "shortText")
    @Mapping(target = "articleDTO.mainText", source = "mainText")
    @Mapping(target = "articleDTO.author", source = "author")
    @Mapping(target = "articleDTO.creationDateTime", source = "creationDateTime")
    @Mapping(target = "updateDateTime", source = "updateDateTime")
    ArticleDTO toArticleDTO(Article article);

}
