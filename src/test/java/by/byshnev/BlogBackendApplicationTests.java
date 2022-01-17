package by.byshnev;

import by.byshnev.controllers.ArticlesRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BlogBackendApplicationTests {

    @Autowired
    private ArticlesRestController articlesRestController;

    @Test
    void contextLoads() throws Exception {
        assertThat(articlesRestController).isNotNull();
    }

}
