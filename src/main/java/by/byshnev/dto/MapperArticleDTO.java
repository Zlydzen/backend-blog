package by.byshnev.dto;

import by.byshnev.models.Article;
import org.modelmapper.ModelMapper;

public class MapperArticleDTO {

    public ArticleDTO createDto (){
        Article article = new Article();
        ModelMapper mapper = new ModelMapper();
        ArticleDTO mapArticle = mapper.map(article, ArticleDTO.class);
        return mapArticle;
    }
}
