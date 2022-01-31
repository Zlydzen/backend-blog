package by.byshnev.dao;

import by.byshnev.entities.Article;

import java.util.List;

public interface ArticleDAO {

    List<Article> allArticles();

    Article getById(int id);
}
