package by.byshnev.endpoints.unit.controller;

import by.byshnev.controllers.ArticlesRestController;
import by.byshnev.entities.Article;
import by.byshnev.services.ArticleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CreateArticleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    ArticleService articleService;  //the analog of repo

    @Test
    public void createArticle_whenPostMethod() throws Exception {

        Article article = new Article();
        article.setShortText("Short text");

        mockMvc.perform(post("/articles/new")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }
}