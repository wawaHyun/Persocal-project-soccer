package com.turing.api.user;

import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.turing.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService ser;

    @PostMapping("/userName,pw")
    public Map<String, ?> postIdPw(@RequestBody Map<String, ?> map) {
        String userName = (String) map.get("userName");
        String pw = (String) map.get("pw");
        Map<String, String> userMap = new HashMap<>();
        userMap.put("userName", userName);
        userMap.put("pw", pw);
        return userMap;
    }

    UserServiceImpl auth;

    public Map<String, ?> save(Scanner sc) throws SQLException {
        System.out.println("Please enter information below in order.");
        System.out.println("ID, PW, name, phoneNum, job, height, weight");
        System.out.println("jaja 998 jainname 010555 OLdesu 180.0 70.0");

        return auth.save(Member.builder()
                .memId(sc.next())
                .memPw(sc.next())
                .name(sc.next())
                .phone(sc.next())
                .job(sc.next())
                .height(sc.nextDouble())
                .weight(sc.nextDouble())
                .build());
    }

    public Map<String, ?> findAll() throws SQLException {
        return auth.findAll();
    }

    public Map<String, ?> login(Scanner sc) throws SQLException {
        System.out.println("Please enter your ID & PW.");
        return auth.login(Member.builder()
                .memId(sc.next())
                .memPw(sc.next())
                .build());
    }

    public Map<String, ?> findById(Scanner sc) throws SQLException {
        System.out.println("Please enter Long ID you want to search for.");
        return auth.findById(sc.nextLong());
    }

    public Map<String, ?> updatePassword(Scanner sc) throws SQLException {
        System.out.println("Start update for password.\n" +
                "Please enter your ID & PW & reconfirm Pw.");
        return auth.updatePassword(Member.builder()
                .memId(sc.next())
                .memPw(sc.next())
                .memPwRe(sc.next())
                .build());
    }

    public Map<String, ?> delete(Scanner sc) throws SQLException {
        System.out.println("Please enter you want dalete memid & mempw.");
        return auth.delete(Member.builder()
                .memId(sc.next())
                .memPw(sc.next())
                .build());
    }

    public Map<String, ?> existsById(Scanner sc) {
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

    public Map<String, ?> getOne(Scanner sc) {
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
