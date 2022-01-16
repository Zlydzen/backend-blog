package by.byshnev.mappers;

import by.byshnev.dto.ArticleDTO;
import by.byshnev.models.Article;
import org.springframework.stereotype.Service;

@Service
public class MapperUtil {

    public ArticleDTO mapToArticleDTO(Article article) {
        ArticleDTO dto = new ArticleDTO();
    dto.setId(article.getId());
    }
}
