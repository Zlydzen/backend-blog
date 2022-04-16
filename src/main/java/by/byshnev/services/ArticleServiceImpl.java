package by.byshnev.services;

import by.byshnev.dao.ArticleDAOImpl;
import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import by.byshnev.mappers.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    private final ArticleDAOImpl articleDAO;


    @Override
    public List<ArticleDto> getArticles() {
        List<Article> articles = articleDAO.getArticles();
        return articleMapper.toListArticleDto(articles);
    }

    @Override
    public void create(ArticleDto articleDto) {

    }

    @Override
    public ArticleDto getById(int id) {
        return articleMapper.toArticleDto(articleDAO.getById(id));
    }
}
