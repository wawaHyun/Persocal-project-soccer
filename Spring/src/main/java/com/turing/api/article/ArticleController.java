
package com.turing.api.article;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ArticleController {
   
    ArticleService artSer;

    public List<?> findArticleByWeb() throws SQLException {
        return artSer.findArticleByWeb();
    }
}
