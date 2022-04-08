package by.byshnev.services;

import by.byshnev.dao.ArticleDAO;
import by.byshnev.dto.ArticleDto;
import by.byshnev.mappers.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    private final ArticleDAO articleDAO;

    @Override
    public List<ArticleDto> getAllArticles() {
        return articleMapper.toListArticleDto(articleDAO.allArticles());
    }

    @Override
    public ArticleDto addArticleDto(ArticleDto articleDto) {
        List<ArticleDto> list = articleMapper.toListArticleDto(articleDAO.allArticles());
        articleDto.setId(list.size()+1);
        list.add(articleDto);
        return articleDto;
    }
}
