
package com.study.api.article;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.sql.SQLException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.board.Board;
import com.study.api.enums.Messenger;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class ArticleController {
   
    private final ArticleServiceImpl ser;
    private final ArticleRepository repo;

    @GetMapping("/api/all-articles")
    public Map<?,?>FindAll() throws SQLException{
        Map<String,Object> map = new HashMap<>();
       
        // @SuppressWarnings("unchecked")
        // List<Article> list = new ArrayList<>();
        // list.add(Article.builder()
        // .id(0L)
        // .title("title test")
        // .content("content test")
        // .registerDate("24.03.27")
        // .board(null)
        // .build());
       
        List<Article> list = ser.findAll();

        if(list.isEmpty()) {
            map.put("message", Messenger.FAIL);
        } else {
            map.put("message", Messenger.SUCCESS);
            System.out.println("리스트 사이즈 : "+list.size());
            System.out.println("message "+map.get("message"));
            // System.out.println("result "+map.get("result"));

            System.out.println(list.get(0));
        }
        map.put("result",list);

        return map;
    }



}
