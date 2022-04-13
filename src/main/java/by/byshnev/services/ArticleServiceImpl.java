package by.byshnev.services;

import by.byshnev.dao.ArticleDAO;
import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import by.byshnev.mappers.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    private final ArticleDAO articleDAO;

    @Override
    public List<ArticleDto> getAllArticles() {
        List<Article> articles = articleDAO.allArticles();
        return articleMapper.toListArticleDto(articles);
    }

    @Override
    public void addArticleDto(ArticleDto articleDto) {
        Article article = new Article();
        articleDAO.addArticle(article);
        articleMapper.toArticleDto(article);
    }

    @Override
    public Optional<ArticleDto> getById(int id) {
        return Optional.ofNullable(articleMapper.toArticleDto(articleDAO.getById(id)));
    }
}
