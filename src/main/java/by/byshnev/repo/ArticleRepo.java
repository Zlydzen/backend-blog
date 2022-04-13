package by.byshnev.repo;

import by.byshnev.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepo extends JpaRepository<Article, Integer> {
}
