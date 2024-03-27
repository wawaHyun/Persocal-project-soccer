

package com.study.api.article;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name="articles")
public class Article {
    @Id
    @Column(name="arti_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String title ;
    private String content;
    private String writer;
    private String registerDate;
    @Builder(builderClassName =  "builer")
    public Article(Long id, String title, String content, 
    String writer,String registerDate){
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.registerDate = registerDate;
    }}