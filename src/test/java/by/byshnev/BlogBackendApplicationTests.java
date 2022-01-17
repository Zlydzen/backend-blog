package by.byshnev;

import by.byshnev.controllers.ArticlesRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class BlogBackendApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ArticlesRestController articlesRestController;

    @Test
    void contextLoads() throws Exception {
        assertThat(articlesRestController).isNotNull();

        this.mockMvc.perform(get("/articles"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
