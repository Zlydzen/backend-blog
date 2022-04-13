package by.byshnev.endpoints.unit.controller;

import by.byshnev.controllers.ArticlesRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
public class FindByIdControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private ArticlesRestController articlesRestController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(articlesRestController).isNotNull();
    }
}
