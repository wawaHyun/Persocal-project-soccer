package com.turing.api.user;

import java.util.*;

import com.turing.api.account.Account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name="members")
public class Member {
    
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String memId;
        private String memPw;
        private String memPwRe;
        private String name;
        private String phone;
        private Long address;
        private String job;
        private Double height;
        private Double weight;

        @OneToMany
        private List<Account> account;

        @Builder(builderClassName = "builder")
        public Member(Long id,String memId, String memPw, String memPwRe, String name,
                      String phone, Long address, String job, Double height, Double weight){
            this.id = id;
            this.memId = memId;
            this.memPw = memPw;
            this.memPwRe = memPwRe;
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.job = job;
            this.height = height;
            this.weight = weight;
        }
}
