package by.byshnev.services;

import by.byshnev.dao.ArticleDAO;
import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import by.byshnev.mappers.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RequiredArgsConstructor
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    private final ArticleDAO articleDAO;

    private static final AtomicInteger ARTICLE_ID_HOLDER = new AtomicInteger();

    @Override
    public List<ArticleDto> getAllArticles() {
        List<Article> articles = articleDAO.allArticles();
        return articleMapper.toListArticleDto(articles);
    }

    @Override
    public void addOne(ArticleDto articleDto) {
        final int articleID = ARTICLE_ID_HOLDER.incrementAndGet();
        Article article = new Article();
        article.setId(articleID);
        articleDto = articleMapper.toArticleDto(article);
    }

    @Override
    public ArticleDto getById(int id) {
        return articleMapper.toArticleDto(articleDAO.getById(id));
    }
}
