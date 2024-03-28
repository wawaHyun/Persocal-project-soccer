package com.study.api.user;

import java.sql.SQLException;
import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class UserController {
    
    UserService ser;
    UserServiceImpl auth;
    private final UserRepository repo;

    @PostMapping(path = "/api/join")
    public Map<String, ?> join(@RequestBody Map<?, ?>requMap)  {
        System.out.println("join 들어옴");
        @SuppressWarnings("null")
        Member newmem = repo.save(Member.builder()
        .memId((String)requMap.get("memId"))
        .memPw((String) requMap.get("memPw"))
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
        Optional<Member> mem = repo.findByMemId((String)paraMap.get("memid"));

        if(mem.isEmpty()){resMap.put("Messenge",Messenger.FAIL);return resMap;}

        resMap.put("Messenge",mem.get().getMemPw().equals(paraMap.get("password")) ?
        Messenger.SUCCESS : Messenger.WRONG_PASSWORD);
        return resMap;    
    }




    public List<Member> findAll() throws SQLException {
        return auth.findAll();
    }
    public Optional<Member> findById(Scanner sc) throws SQLException {
        System.out.println("Please enter Long ID you want to search for.");
        return auth.findById(sc.nextLong());
    }

    public Map<String, ?> updatePassword(Scanner sc) throws SQLException {
        System.out.println("Start update for password.\n" +
                "Please enter your ID & PW & reconfirm Pw.");
        return auth.updatePassword(Member.builder()
                .memId(sc.next())
                .memPw(sc.next())
                .build());
    }

    public Messenger delete(Scanner sc) throws SQLException {
        System.out.println("Please enter you want dalete memid & mempw.");
        return auth.delete(Member.builder()
                .memId(sc.next())
                .memPw(sc.next())
                .build());
    }

    public Boolean existsById(Scanner sc) {
        return auth.existsById(sc.nextLong());
    }

    public Map<String, ?> findUsersByJob(Scanner sc) {
        System.out.println("Please enter the job you wish to search for.");
        return auth.findUsersByJob(sc.next());
    }

    public Map<String, ?> findUsersByJobFromMap(Scanner sc) {
        System.out.println("Please enter the job you wish to search for.");
        return auth.findUsersByJobFromMap(sc.next());
    }

    public Map<String, ?> findUsersByName(Scanner sc) {
        System.out.println("Please enter the name you wish to search for.");
        return auth.findUsersByName(Member.builder()
                .name(sc.next())
                .build());
    }

    public Map<String, ?> findUsersByNameFromMap(Scanner sc) {
        System.out.println("Please enter the name you wish to search for.");
        return auth.findUsersByNemeFramMap(sc.next());
    }

    public String count() {
        return auth.count();
    }

    public String addUsers() {
        return auth.addUsers();
    }

    public Optional<Member> getOne(Scanner sc) {
        return auth.getOne(sc.next());
    }

    public Map<String, ?> getUserMap() {
        return auth.getUserMap();
    }

    public String test() {
        return auth.test();
    }

    public Map<String, ?> findUsers() throws SQLException {
        return auth.findUsers();
    }

    public Messenger touch() {
        return auth.touch();
    }

    public Messenger rm() {
        return auth.rm();
    }

    public Map<String, ?> tain(Scanner sc) throws SQLException {
        System.out.println("Please enter information below in order.");
        System.out.println("ID, PW, name, phoneNum, job, height, weight");
        System.out.println("jaja 998 jainname 010555 jobjob 180 70");

        return auth.tain(Member.builder()
                .memId(sc.next())
                .memPw(sc.next())
                .name(sc.next())
                .phone(sc.next())
                .job(sc.next())
                .height(sc.nextDouble())
                .weight(sc.nextDouble())
                .build());
    }

    public Map<String, ?> ls() throws SQLException {
        return auth.ls();
    }
}