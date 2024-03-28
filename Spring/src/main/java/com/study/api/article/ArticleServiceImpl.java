
package com.study.api.article;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@SuppressWarnings("rawtypes")
@Service
@RequiredArgsConstructor //singleton
public class ArticleServiceImpl implements ArticleService{

    private final ArticleRepository repo;

    @Override
    public List<Article> findAll() {
       return repo.findAll();
    }
}