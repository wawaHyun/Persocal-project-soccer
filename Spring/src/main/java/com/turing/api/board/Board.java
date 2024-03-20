
package com.turing.api.board;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"title"})
public class Board {
    private String title ;
    private String content;
    private String writer;
    @Builder(builderClassName =  "builer")
    public Board(String title, String content, String writer){
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

}