
package com.study.api.article;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class ArticleController {
   
    private final ArticleService ser;

    @GetMapping("/api/articles")
    public Map<?,?>FindAll(){
        Map<String,Object> map = new HashMap<>();
        map.put("message",Messenger.SUCCESS);
       
        // @SuppressWarnings("unchecked")
        // List<Article> arrlist = new ArrayList<>();
        // arrlist.add(Article.builder()
        // .id(0L)
        // .title("title test")
        // .content("content test")
        // .writer("name!")
        // .registerDate("24.03.27")
        // .build());
        
        List<Article>list = ser.findAll();
        map.put("result",list);

        return map;
    }

}
