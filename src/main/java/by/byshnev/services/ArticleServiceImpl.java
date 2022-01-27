package by.byshnev.services;

import by.byshnev.dao.ArticleDAOImpl;
import by.byshnev.dto.ArticleDto;
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
    public List<ArticleDto> getAllArticles() {
        return articleMapper.toListArticleDto(articleDAO.allArticles());
    }
}
