package by.byshnev.endpoints.unit.controller;

import by.byshnev.controllers.ArticlesRestController;
import by.byshnev.entities.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ListArticlesControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    ArticlesRestController articlesRestController;

    @Test
    public void listAllUsers_whenGetMethod() throws Exception {
        assertThat(articlesRestController).isNotNull();

        Article article = new Article();
        article.setAuthor("Test name");

        mvc.perform(get("/articles")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}