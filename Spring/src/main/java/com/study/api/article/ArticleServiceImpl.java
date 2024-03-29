
package com.study.api.article;

import lombok.RequiredArgsConstructor;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

// @SuppressWarnings("rawtypes")
@Service
@RequiredArgsConstructor //singleton
public class ArticleServiceImpl implements ArticleService{

    private final ArticleRepository repo;   

    @Override
    public List<Article> findAll() throws SQLException {
       return repo.findAll();
    }
}