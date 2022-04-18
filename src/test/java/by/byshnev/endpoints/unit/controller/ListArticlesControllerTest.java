package by.byshnev.endpoints.unit.controller;

import by.byshnev.controllers.ArticlesRestController;
import by.byshnev.dto.ArticleDto;
import by.byshnev.entities.Article;
import by.byshnev.mappers.ArticleMapper;
import by.byshnev.services.ArticleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ListArticlesControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    ArticlesRestController articlesRestController;

    @MockBean
    private ArticleService articleService; // the analog of repo

    @Test
    public void listAllUsers_whenGetMethod() throws Exception {
        LocalDateTime creationDate = LocalDateTime.now();
        Article articleOne = new Article();
        articleOne.setId(1);
        articleOne.setAuthor("M.Brown");
        articleOne.setTitle("Beautiful name of book");
        articleOne.setShortText("Some short text");
        articleOne.setMainText("The main text is very long to typing it here");
        articleOne.setCreationDateTime(creationDate);
        articleOne.setUpdateDateTime(LocalDateTime.now());

        LocalDateTime creationDateTwo = LocalDateTime.of(1995, Month.JANUARY,26,13,24,12);
        Article articleTwo = new Article();
        articleTwo.setId(2);
        articleTwo.setAuthor("J.Patterson");
        articleTwo.setTitle("A long journey story");
        articleTwo.setShortText("Once upon a time");
        articleTwo.setMainText("It was long time ago, when dinosaurs lived");
        articleTwo.setCreationDateTime(creationDateTwo);
        articleTwo.setUpdateDateTime(LocalDateTime.now());

        ArticleDto articleDtoOne = articleMapper.toArticleDto(articleOne);
        ArticleDto articleDtoTwo = articleMapper.toArticleDto(articleTwo);

        List<ArticleDto> articleDtoList = new ArrayList<>();
        articleDtoList.add(articleDtoOne);
        articleDtoList.add(articleDtoTwo);

        Mockito.when(articleService.getArticles()).thenReturn(articleDtoList);

        MvcResult mvcResult = mvc.perform(get("/articles")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        String actualJsonResult = mvcResult.getResponse().getContentAsString();
        System.out.println(actualJsonResult);

        String expectedJsonResponse = objectMapper.writeValueAsString(articleDtoList);

        assertThat(actualJsonResult).isEqualToIgnoringWhitespace(expectedJsonResponse);
    }
}