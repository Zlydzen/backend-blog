package by.byshnev;

import by.byshnev.controllers.ArticlesRestController;
import by.byshnev.entities.Article;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class BlogBackendApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ArticlesRestController articlesRestController;

    @Test
    void getAllArticles() throws Exception {

        Article article = new Article();
        article.setAuthor("Dostoevsky");

        MvcResult mvcResult = mockMvc.perform(
                get("/articles"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        String contentJsonAsString = mvcResult.getResponse().getContentAsString();
        System.out.println(contentJsonAsString);

    }
}
