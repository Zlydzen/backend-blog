package by.byshnev.services;

import by.byshnev.dao.ArticleDAOImpl;
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

    private final ArticleDAOImpl articleDAO;

    public List<ArticleDto> getArticles() {
        List<Article> articles = articleDAO.getArticles();
        return articleMapper.toListArticleDto(articles);
    }

    @Override
    public void create(ArticleDto articleDto) {
        articleDAO.create(articleMapper.toArticleEntity(articleDto));
    }

    public Optional<ArticleDto> getById(int id) {
        Article byId = articleDAO.getById(id);
        return Optional.ofNullable(articleMapper.toArticleDto(byId));
    }

    @Override
    public void update(ArticleDto articleDto, int id) {
        Article article = articleMapper.toArticleEntity(articleDto);
        articleDAO.update(article,id);
    }
}
