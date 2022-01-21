package by.byshnev;

import by.byshnev.controllers.ArticlesRestController;
import by.byshnev.dto.ArticleDto;
import by.byshnev.models.ArticleEntity;
import by.byshnev.services.ArticleService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;
import java.util.List;

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
    private ArticleService articleService;

    @Autowired
    private ArticlesRestController articlesRestController;

    @Test
    void contextLoads() throws Exception {
        assertThat(articlesRestController).isNotNull();

        MvcResult mvcResult = this.mockMvc.perform(get("/articles"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        String contentJsonAsString = mvcResult.getResponse().getContentAsString();
        System.out.println(contentJsonAsString);

    }
}
