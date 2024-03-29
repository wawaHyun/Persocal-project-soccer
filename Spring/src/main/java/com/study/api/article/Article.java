

package com.study.api.article;
import com.study.api.board.Board;
import com.study.api.user.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @Column(name="register_date")
    private String registerDate;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    // @ManyToOne
    // @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    // private Member writer;

    @Builder(builderClassName="builder")
    public Article(Long id, String title, String content, 
    String registerDate
    , Board board
    // , Member writer
    ){
        this.id = id;
        this.title = title;
        this.content = content;
        this.registerDate = registerDate;
        this.board = board;
        // this.writer = writer;
    }
}