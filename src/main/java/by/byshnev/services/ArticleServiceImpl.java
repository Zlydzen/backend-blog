package by.byshnev.services;

import by.byshnev.dao.ArticleDAO;
import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import by.byshnev.mappers.ArticleMapper;
import by.byshnev.repo.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    private final ArticleDAO articleDAO;

    private ArticleRepo articleRepo;

    @Override
    public List<ArticleDto> getAllArticles() {
        List<Article> articles = articleRepo.findAll();
        return articleMapper.toListArticleDto(articles);
    }

    @Override
    public void addArticleDto(ArticleDto articleDto) {
        Article article = new Article();
        articleDAO.addArticle(article);
        articleMapper.toArticleDto(article);
    }
}
