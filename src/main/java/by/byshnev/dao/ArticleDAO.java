package by.byshnev.dao;

import by.byshnev.entities.Article;

import java.util.List;

public interface ArticleDAO {
    public List<Article> allArticles();

    public void addArticle(Article article);
}
