package by.byshnev.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ArticlesRestController {

    public static class Article {

        private int ID;
        private String Title;
        private String shortText;
        private String mainText;
        private String author;
        private Date creationDateTime;
        private Date updateDateTime;

        @RequestMapping(value = "/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public List<Article> restArticle() {

            return null;
        }
    }
}
