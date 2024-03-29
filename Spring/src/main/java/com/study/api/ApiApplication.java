package com.study.api;

import org.hibernate.boot.archive.scan.spi.AbstractScannerImpl.ArchiveContextImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.study.api.article.Article;
import com.study.api.article.ArticleController;

@SpringBootApplication
public class ApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
