package by.byshnev.mappers;

import by.byshnev.dto.ArticleDTO;
import by.byshnev.models.Article;
import org.springframework.stereotype.Service;

@Service
public class MapperUtil {

    public ArticleDTO mapToArticleDTO(Article article) {
        ArticleDTO dto = new ArticleDTO();
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
