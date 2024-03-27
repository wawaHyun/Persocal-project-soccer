
package com.study.api.article;

import lombok.RequiredArgsConstructor;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.study.api.common.AbstractService;
import com.study.api.enums.Messenger;


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