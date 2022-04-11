package by.byshnev.endpoints.unit.controller;

import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import by.byshnev.mappers.ArticleMapper;
import by.byshnev.services.ArticleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CreateArticleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @MockBean
    ArticleService articleService;  //the analog of repo

    @Test
    public void createArticle_whenPostMethod() throws JsonProcessingException, Exception {

        Article newArticle = new Article();
        newArticle.setAuthor("Tolstoy");
        Article savedArticle = new Article();
        savedArticle.setId(1);
        savedArticle.setAuthor("Tolstoy");

        ArticleDto newArticleDto = articleMapper.toArticleDto(newArticle);
        ArticleDto savedArticleDto = articleMapper.toArticleDto(savedArticle);

        mockMvc.perform(
                post("/articles/new")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(newArticleDto))
                ).andExpect(status().isOk());
    }
}