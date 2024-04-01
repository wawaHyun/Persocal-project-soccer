package com.study.api.user;

import java.sql.SQLException;
import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    
    private final UserService ser;
    private final UserRepository repo;

    @PostMapping(path = "/api/join")
    public Map<String, ?> join(@RequestBody Map<?, ?>requMap)  {
        System.out.println("join 들어옴");

        @SuppressWarnings("null")
        User newmem = repo.save(User.builder()
        .username((String)requMap.get("memId"))
        .password((String) requMap.get("memPw"))
        .name((String) requMap.get("name"))
        .phone((String) requMap.get("phone"))
        .job((String) requMap.get("job"))
        .height(Double.parseDouble((String)requMap.get("height")))
        .weight(Double.parseDouble((String)requMap.get("weight")))
        .build());

        System.out.println("Db에 저장된 정보 "+newmem);
        Map<String, Messenger> resMap = new HashMap<>();
        resMap.put("messenge",Messenger.SUCCESS);

        return resMap;
    }



    @PostMapping(path ="/api/login")
    public Map<String, ?> login(@RequestBody Map<String, ?>paraMap) throws SQLException {
        Map<String, Messenger> resMap = new HashMap<>();
        Optional<User> mem = repo.findByUsername((String)paraMap.get("memid"));

        if(mem.isEmpty()){resMap.put("Messenge",Messenger.FAIL);return resMap;}

        resMap.put("Messenge",mem.get().getPassword().equals(paraMap.get("password")) ?
        Messenger.SUCCESS : Messenger.WRONG_PASSWORD);
        return resMap;    
    }




    @GetMapping("/api/all-users")
    public Map<String,?> findAll() {
        Map<String,Object> resMap = new HashMap<>();

    //   @SuppressWarnings("unchecked")
    //     List<User> list = List.of(User.builder()
    //     .id(0L)
    //     .username("idid")
    //     .password("password")
    //     .name("name")
    //     .phone("phone")
    //     .job("ob")
    //     .height(180.0)
    //     .weight(80.0)
    //     .build());

        List<User> list = repo.findAll();

        if(list.isEmpty()){
            resMap.put("message", Messenger.FAIL);
        }else{
            resMap.put("message", Messenger.SUCCESS);
            resMap.put("result", list);
            System.out.println("리스트 사이즈 : "+list.size());
        }

        return resMap;
    }


}
