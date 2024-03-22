package com.turing.api.user;

import java.util.*;
import org.springframework.stereotype.Service;
import com.turing.api.common.AbstractService;
import com.turing.api.enums.Messenger;

@Service
public class UserServiceImpl extends AbstractService<Member> implements UserService {
    private static UserRepository repo;

    Map<String, Member> users;

    @Override
    public Messenger save(Member mem){

        // Messenger result = Messenger.FAIL;
        // if (!users.containsKey(mem.getMemId())) {
            // users.put(mem.getMemId());
            // return repo.tain(member);
        // }
        // System.out.println("same ID already exists.");
        return Messenger.SUCCESS;
    }


    
    @Override
    public Map<String, ?> login(Member member)  {
        Map<String,Member> resMap = new HashMap<>();
        
        // if (!member.getMemId().equals(list.get(0))) {
        //     return "ID [" + member.getMemId() + "] is wrong ID";
        // }
        // if (!member.getMemPw().equals(list.get(1))) {
        //     return "Wrong password input.";
        // }


        return null;
    }
    
    @Override
    public List<Member> findAll()  {
        // return new ArrayList<>(users.values());
        // List<Member> list = repo.findAll();
        // list.forEach(System.out::println);
        System.out.println("Ok!");
        return null;
    }
    @Override
    public Optional<Member> findById(Long id)  {
        // return Optional.of(users
        // .values().stream()
        // .filter(i->i.getId().equals(id))
        // .toList().get(0));
        // repo.findById(id);
        return null;
    }

    @Override
    public Map<String, ?> updatePassword(Member member)  {
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
    public Messenger delete(Member member)  {
        // users.remove(member.getMemId());
        // List<String> list = repo.login(member);
        // if (!member.getMemId().equals(list.get(0))) {
        //     System.out.println("ID [" + member.getMemId() + "] is wrong ID");
        //     return null;
        // }
        // if (!member.getMemPw().equals(list.get(1))) {
        //     System.out.println("Wrong password input.");
        //     return null;
        // }
        // System.out.println("ID n PW is oK");
        // repo.delete(member);
        // System.out.println("successful delete.");

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
        // return users
        //         .entrySet()
        //         .stream()
        //         .filter(i -> i.getKey().equals(memid))
        //         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return null;
    }

    @Override
    public Map<String, ?> findUsersByJob(String userJob) {
        System.out.println("findUsersByJob 파라미터 : " + userJob);
        users.values()
                .stream().forEach(i -> System.out.println("직업 :" + i.getJob()));
        // return users
        //         .values()
        //         .stream()
        //         .filter(i -> i.getJob().equals(userJob))
        //         .collect(Collectors.toList());
        return null;
    }

    @Override
    public Map<String, ?> findUsersByJobFromMap(String job) {
        // return users
        //         .entrySet()
        //         .stream()
        //         .filter(i -> i.getValue().getJob().equals(job))
        //         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return null;
    }

    @Override
    public String count() {
        return users.size() + "";
    }

    @Override
    public Optional<Member> getOne(String memid) {
        return null;
    }

    @Override
    public Map<String, ?> getUserMap() {
        return null;
    }

    @Override
    public String addUsers() {
    //     IntStream.range(0, 5)
    //             .mapToObj(i -> util.createRandomMemberId())
    //             .forEach(i -> {
    //                 users.put(i, Member.builder()
    //                         .memId(i)
    //                         .memPw("1111")
    //                         .name(util.createRandomName())
    //                         .job(util.createRandomJob())
    //                         .address((long) (util.createRandomInteger(10, 99)))
    //                         .build());
    //             });
        return "add dummy : " + users.size();
    }

    @Override
    public String test() {
        return null;
    }

    @Override
    public Map<String, ?> findUsers() {
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
    public Map<String, ?> tain(Member mems)  {
        return null;
    }

    @Override
    public Map<String, ?> ls() {
        return null;
    }

}
