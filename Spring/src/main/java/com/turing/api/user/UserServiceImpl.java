package com.turing.api.user;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.turing.api.common.AbstractService;
import com.turing.api.common.UtilService;
import com.turing.api.common.UtilServiceImpl;
import com.turing.api.enums.Messenger;

@Service
public class UserServiceImpl extends AbstractService<Member> implements UserService {
    private static UserRepository repo;

    Map<String, Member> users;

    @Override
    public Map<String, ?> save(Member member) throws SQLException {
        Messenger result = Messenger.FAIL;
        if (!users.containsKey(member.getMemId())) {
            users.put(member.getMemId(), member);
            return repo.tain(member);
        }
        System.out.println("same ID already exists.");
        return null;
    }


    @Override
    public Map<String, ?> findAll() throws SQLException {
        // return new ArrayList<>(users.values());
        List<Member> list = repo.findAll();
        list.forEach(System.out::println);
        System.out.println("Ok!");
        return null;
    }

    @Override
    public Map<String, ?> login(Member member) throws SQLException {
        List<String> list = repo.login(member);

        if (!member.getMemId().equals(list.get(0))) {
            return "ID [" + member.getMemId() + "] is wrong ID";
        }
        if (!member.getMemPw().equals(list.get(1))) {
            return "Wrong password input.";
        }
        return null;
    }

    @Override
    public Map<String, ?> findById(Long id) throws SQLException {
        // return Optional.of(users
        // .values().stream()
        // .filter(i->i.getId().equals(id))
        // .toList().get(0));
        // repo.findById(id);
        return null;
    }

    @Override
    public Map<String, ?> updatePassword(Member member) throws SQLException {
        if (!member.getMemPw().equals(member.getMemPwRe())) {
            System.out.println("pw and reconfirm pw is Different.");
            return null;
        }
        System.out.println("password is same");
        // repo.updatePassword(member);

        System.out.println("Password is successful update.");
        return null;
    }

    @Override
    public Messenger delete(Member member) throws SQLException {
        // users.remove(member.getMemId());
        List<String> list = repo.login(member);
        if (!member.getMemId().equals(list.get(0))) {
            System.out.println("ID [" + member.getMemId() + "] is wrong ID");
            return null;
        }
        if (!member.getMemPw().equals(list.get(1))) {
            System.out.println("Wrong password input.");
            return null;
        }
        System.out.println("ID n PW is oK");
        repo.delete(member);
        System.out.println("successful delete.");

        return null;
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }

    @Override
    public Map<String, ?> findUsersByName(Member name) {

        return null;
    }

    @Override
    public Map<String, ?> findUsersByNemeFramMap(String memid) {
        System.out.println("11 :" + memid);
        return users
                .entrySet()
                .stream()
                .filter(i -> i.getKey().equals(memid))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public Map<String, ?> findUsersByJob(String userJob) {
        System.out.println("findUsersByJob 파라미터 : " + userJob);
        users.values()
                .stream().forEach(i -> System.out.println("직업 :" + i.getJob()));
        return users
                .values()
                .stream()
                .filter(i -> i.getJob().equals(userJob))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, ?> findUsersByJobFromMap(String job) {
        return users
                .entrySet()
                .stream()
                .filter(i -> i.getValue().getJob().equals(job))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public String count() {
        return users.size() + "";
    }

    @Override
    public Map<String, ?> getOne(String memid) {
        return null;
    }

    @Override
    public Map<String, ?> getUserMap() {
        return null;
    }

    @Override
    public String addUsers() {
        IntStream.range(0, 5)
                .mapToObj(i -> util.createRandomMemberId())
                .forEach(i -> {
                    users.put(i, Member.builder()
                            .memId(i)
                            .memPw("1111")
                            .name(util.createRandomName())
                            .job(util.createRandomJob())
                            .address((long) (util.createRandomInteger(10, 99)))
                            .build());
                });
        return "add dummy : " + users.size();
    }

    @Override
    public String test() {
        return null;
    }

    @Override
    public Map<String, ?> findUsers() throws SQLException {
        return null;
    }

    @Override
    public Messenger touch() {
        return null;
    }

    @Override
    public Messenger rm() {
        return null;
    }

    @Override
    public Map<String, ?> tain(Member mems) throws SQLException {
        return null;
    }

    @Override
    public Map<String, ?> ls() throws SQLException {
        return null;
    }

}
